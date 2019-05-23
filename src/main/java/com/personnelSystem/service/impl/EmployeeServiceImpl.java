package com.personnelSystem.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import com.personnelSystem.entity.*;
import com.personnelSystem.mapper.DepartmentMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.personnelSystem.dto.admin.EmployeeInfoDto;
import com.personnelSystem.dto.criteria.SearchEmployeeCriteria;
import com.personnelSystem.entity.DepartmentEmployeeExample.Criteria;
import com.personnelSystem.mapper.DepartmentEmployeeMapper;
import com.personnelSystem.mapper.EmployeeMapper;
import com.personnelSystem.service.EmployeeService;
import com.personnelSystem.util.ResultDataDto;
import com.personnelSystem.util.SystemConstant;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	private static Logger log = LoggerFactory.getLogger(EmployeeServiceImpl.class);
	
	@Autowired 
	private EmployeeMapper employeeMapper;
	
	@Autowired
	private DepartmentEmployeeMapper departmentEmployeeMapper;

	@Autowired
	private DepartmentMapper departmentMapper;

	public List<EmployeeInfoDto> listEmployeeInfoDto(SearchEmployeeCriteria Criteria) {
		List<Employee> employeeList = employeeMapper.listEmployee(Criteria);
		ArrayList<Integer> list = new ArrayList<>();
		HashMap<Integer, String> map = new HashMap<>();
		for (Employee employee : employeeList) {
			list.add(employee.getMgr());
		}
		List<Employee> employees = employeeMapper.selectByIds(list);
		for (Employee employee : employees) {
			map.put(employee.getId(),employee.getNickname());
		}
		for (Employee employee : employeeList) {
			employee.setMgrName(map.get(employee.getMgr()));
		}
		return transEmployeeRecordToDtos(employeeList);
	}

	public EmployeeInfoDto getDetail(Integer employeeId) {
		EmployeeInfoDto employeeInfoDto = null;

		if (employeeId != null) {
			Employee record = employeeMapper.selectByPrimaryKey(employeeId);

			if (record !=null ) {
				employeeInfoDto = transEmployeeRecordToDto(record);
			}
		}

		DepartmentEmployee departmentId = departmentEmployeeMapper.getDepartmentInfo(employeeId);
		if (departmentId != null && departmentId.getDepartmentid() != null) {
			employeeInfoDto.setDepartmentId(departmentId.getDepartmentid());
		}
		return employeeInfoDto;
	}

	public ResultDataDto insert(EmployeeInfoDto employeeDto) throws Exception {
		ResultDataDto resultData = new ResultDataDto();
		Employee employee = null;
		DepartmentEmployee departmentEmployee = null;
		try {
			employeeDto.setCreatedById(1);
			employeeDto.setModifyById(1);
			employeeDto.setIsadmin(0);
			employee = transDtoRecordToEmployee(employeeDto);
			employeeMapper.insertSelective(employee);
			
			departmentEmployee = new DepartmentEmployee();
			departmentEmployee.setEmlopyeeid(employee.getId());
			departmentEmployee.setDepartmentid(employeeDto.getDepartmentId());
			departmentEmployee.setCreatedbyid(1);
			departmentEmployee.setModifybyid(1);
			departmentEmployeeMapper.insertSelective(departmentEmployee);
			
			resultData.setResultCode(SystemConstant.Code_OK);
			resultData.setResultMessage(String.format(SystemConstant.Msg_Employee_Insert_OK, employee.getId(), employee.getNickname()));			
			
		} catch (Exception exp) {
			String rtnMsg = String.format(SystemConstant.Msg_Employee_Insert_Err, employee.getId(),  exp.toString());
			resultData.setResultCode(SystemConstant.Code_Employee_Insert_Err);
			resultData.setResultMessage(rtnMsg);
			log.error(rtnMsg);
		}
		return resultData;
	}

	public ResultDataDto delete(EmployeeInfoDto employee) throws Exception {
		ResultDataDto resultData = new ResultDataDto();
		try {
			EmployeeExample example = new EmployeeExample();
			EmployeeExample.Criteria criteria = example.createCriteria();
			criteria.andVersionIsNotNull();
			criteria.andVersionEqualTo(false);
			criteria.andIdIsNotNull();
			criteria.andIdEqualTo(employee.getId());
			// 上次的更新时间
			criteria.andModifydatetimeIsNotNull();
			criteria.andModifydatetimeEqualTo(employee.getModifyDateTime());
			List<Employee> records = employeeMapper.selectByExample(example);
			
			if (records == null || records.size() == 0 || records.get(0) == null) {
				resultData.setResultCode(SystemConstant.Code_GetEmployeeID_NotExisted);
				resultData.setResultMessage(String.format(SystemConstant.Msg_GetEmployeeID_NotExisted,employee.getId()));
				return resultData;
			}
			
			Employee employeeRecord = null;
			employeeRecord = records.get(0);
			Date updateNow = new Date();
			employeeRecord.setModifydatetime(updateNow);
			employeeRecord.setVersion(true);

			if (employeeMapper.updateByExampleSelective(employeeRecord, example) < 1) {
				resultData.setResultCode(SystemConstant.Code_DBData_Update_Fail);
				resultData.setResultMessage(SystemConstant.Msg_DBData_Update_Fail);
				return resultData;
			}
			
			/**
			 * 删除部门员工表 department_employee数据
			 */
/*			DepartmentEmployeeExample example2 = new DepartmentEmployeeExample();
			DepartmentEmployeeExample.Criteria criteria2 = example2.createCriteria();
			criteria2.andEmlopyeeidIsNotNull();
			criteria2.andEmlopyeeidEqualTo(employee.getId());
			departmentEmployeeMapper.deleteByExample(example2);*/
			
			resultData.setResultCode(SystemConstant.Code_OK);
			resultData.setResultMessage(String.format(SystemConstant.Msg_Employee_Delete_OK, employeeRecord.getId(), employeeRecord.getNickname()));			

		} catch (Exception exp) {
			String rtnMsg = String.format(SystemConstant.Msg_Employee_Delete_Err, employee.getId(),  exp.toString());
			resultData.setResultCode(SystemConstant.Code_Employee_Delete_Err);
			resultData.setResultMessage(rtnMsg);
			log.error(rtnMsg);
		}
		
		return resultData;
	}

	public ResultDataDto update(EmployeeInfoDto employeeDto) throws Exception {
		ResultDataDto resultData = new ResultDataDto();
		try {
			Date date = new Date();
			
			EmployeeExample example = new EmployeeExample();
			EmployeeExample.Criteria criteria = example.createCriteria();
			criteria.andVersionIsNotNull();
			criteria.andVersionEqualTo(false);
			criteria.andIdIsNotNull();
			criteria.andIdEqualTo(employeeDto.getId());
			// 上次的更新时间
			criteria.andModifydatetimeIsNotNull();
			criteria.andModifydatetimeEqualTo(employeeDto.getModifyDateTime());
			List<Employee> records = employeeMapper.selectByExample(example);

			if (records == null || records.size() < 1) {
				resultData.setResultCode(SystemConstant.Code_DBData_Update_Fail);
				resultData.setResultMessage(SystemConstant.Msg_DBData_Update_Fail);
				return resultData;
			}
			
			DepartmentEmployee departmentInfo = departmentEmployeeMapper.getDepartmentInfo(employeeDto.getId());
			if (departmentInfo == null ) {
				resultData.setResultCode(SystemConstant.Code_DBData_Update_Fail);
				resultData.setResultMessage(SystemConstant.Msg_DBData_Update_Fail);
				return resultData;
			}
			
			departmentInfo.setEmlopyeeid(employeeDto.getId());
			departmentInfo.setDepartmentid(employeeDto.getDepartmentId());
			departmentInfo.setModifydatetime(date);
			DepartmentEmployeeExample example2 = new DepartmentEmployeeExample();
			DepartmentEmployeeExample.Criteria criteria2 = example2.createCriteria();
			criteria2.andEmlopyeeidIsNotNull();
			criteria2.andEmlopyeeidEqualTo(employeeDto.getId());
			departmentEmployeeMapper.updateByExampleSelective(departmentInfo,example2);
			
			Employee employee = new Employee();
			employeeDto.setModifyDateTime(date);
			employee = transDtoRecordToEmployee(employeeDto);
			employeeMapper.updateByExampleSelective(employee,example);
			
			resultData.setResultCode(SystemConstant.Code_OK);
			resultData.setResultMessage(String.format(SystemConstant.Msg_Employee_Update_OK, employee.getId(), employee.getNickname()));			

			
		} catch (Exception exp) {
			String rtnMsg = String.format(SystemConstant.Msg_Employee_Update_Err, employeeDto.getId(),  exp.toString());
			resultData.setResultCode(SystemConstant.Code_Employee_Update_Err);
			resultData.setResultMessage(rtnMsg);
			log.error(rtnMsg);
		}
		return resultData;
	}

	public int count(SearchEmployeeCriteria Criteria) {
		return employeeMapper.countEmployee(Criteria);
	}

	@Override
	public EmployeeInfoDto getEmployee(EmployeeInfoDto employee) {
		EmployeeInfoDto employeeInfoDto = null;

		if (null != employee.getId() && null != employee.getPassword()) {
			Employee record = employeeMapper.selectByIdAndPwd(employee.getId(),employee.getPassword());
			if (record !=null) {
				employeeInfoDto = transEmployeeRecordToDto(record);
			} else if (SystemConstant.Super_Administrator.equals(employee.getId()) && SystemConstant.Super_Administrator_password.equals(employee.getPassword())){
				employeeInfoDto = new EmployeeInfoDto();
				employeeInfoDto.setId(SystemConstant.Super_Administrator);
				employeeInfoDto.setPassword(SystemConstant.Super_Administrator_password);
			}
		}
		return employeeInfoDto;
	}

	@Override
	public List<EmployeeInfoDto> getEmployeeList() {
		List<EmployeeInfoDto> employeeInfoDtos = null;


		List<Employee> employees = employeeMapper.selectAll();
		if (employees.size() > 0) {
			employeeInfoDtos = transEmployeeRecordToDtos(employees);
		}

		return employeeInfoDtos;
	}

	/**
	 * 数据转化
	 *     Employee ==》 EmployeeInfoDto
	 * @param records Employee
	 * @return EmployeeInfoDto
	 */
	private List<EmployeeInfoDto> transEmployeeRecordToDtos(List<Employee> records) {
		
		List<EmployeeInfoDto> list = new ArrayList<EmployeeInfoDto>();
		if (records != null && records.size() > 0) {
			for (Employee record : records) {
				if (record != null) {
					EmployeeInfoDto subjectInfoDto = transEmployeeRecordToDto(record);
					
					DepartmentEmployee departmentId = departmentEmployeeMapper.getDepartmentInfo(record.getId());
					if (departmentId != null && departmentId.getDepartmentid() != null) {
						Department department = departmentMapper.selectByPrimaryKey(departmentId.getDepartmentid());
						subjectInfoDto.setDepartmentId(departmentId.getDepartmentid());
						subjectInfoDto.setDepartmentName(department.getDepartmentname());
					}
					if (subjectInfoDto != null) {
						list.add(subjectInfoDto);
					}
				}
			}
		}
		return list;
	}
	
	/**
	 * 数据转化
	 * Employee =====》 EmployeeInfoDto
	 * @param employee
	 * @return
	 */
	private EmployeeInfoDto transEmployeeRecordToDto(Employee employee) {
		EmployeeInfoDto employeeInfoDto = null;
		if (employee != null) {
			employeeInfoDto = new EmployeeInfoDto();
			employeeInfoDto.setId(employee.getId());
			employeeInfoDto.setNickname(employee.getNickname());
			employeeInfoDto.setSex(employee.getSex());
			employeeInfoDto.setSalary(employee.getSalary());
			employeeInfoDto.setMgr(employee.getMgr());
			employeeInfoDto.setMgrName(employee.getMgrName());
			employeeInfoDto.setMobile(employee.getMobile());
			employeeInfoDto.setEmail(employee.getEmail());
			employeeInfoDto.setHiredate(employee.getHiredate());
			employeeInfoDto.setTerminationDate(employee.getTerminationdate());
			employeeInfoDto.setCreatedById(employee.getCreatedbyid());
			employeeInfoDto.setCreatedTime(employee.getCreatedtime());
			employeeInfoDto.setModifyById(employee.getModifybyid());
			employeeInfoDto.setModifyDateTime(employee.getModifydatetime());
			employeeInfoDto.setVersion(employee.getVersion());
			employeeInfoDto.setIsadmin(employee.getIsadmin());
		}
		
		return employeeInfoDto;
	}

	/**
	 *  数据转化
	 * EmployeeInfoDto =====》 Employee
	 * @param employeeDto
	 * @return
	 */
	private Employee transDtoRecordToEmployee(EmployeeInfoDto employeeDto) {
		Employee employee = null; 
		if (employeeDto!= null) {
			employee = new Employee();
			employee.setId(employeeDto.getId());
			employee.setNickname(employeeDto.getNickname());
			employee.setSex(employeeDto.getSex());
			employee.setSalary(employeeDto.getSalary());
			employee.setMgr(employeeDto.getMgr());
			employee.setMobile(employeeDto.getMobile());
			employee.setEmail(employeeDto.getEmail());
			employee.setHiredate(employeeDto.getHiredate());
			employee.setTerminationdate(employeeDto.getTerminationDate());
			employee.setCreatedtime(employeeDto.getCreatedTime());
			employee.setCreatedbyid(employeeDto.getCreatedById());
			employee.setModifybyid(employeeDto.getModifyById());
			employee.setModifydatetime(employeeDto.getModifyDateTime());
			employee.setVersion(employeeDto.getVersion());
			employee.setIsadmin(employeeDto.getIsadmin());
			employee.setPassword(employeeDto.getPassword());
		}
		return employee;
	}

	
}
