package com.personnelSystem.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.personnelSystem.dto.admin.DepartmentInfoDto;
import com.personnelSystem.dto.admin.EmployeeInfoDto;
import com.personnelSystem.dto.criteria.SearchDepartmentCriteria;
import com.personnelSystem.entity.Department;
import com.personnelSystem.entity.DepartmentEmployee;
import com.personnelSystem.entity.DepartmentExample;
import com.personnelSystem.mapper.DepartmentEmployeeMapper;
import com.personnelSystem.mapper.DepartmentMapper;
import com.personnelSystem.service.DepartmentService;
import com.personnelSystem.util.ResultDataDto;
import com.personnelSystem.util.SystemConstant;

@Service
public class DepartmentServiceImpl implements DepartmentService{
	
	private static Logger log = LoggerFactory.getLogger(DepartmentServiceImpl.class);
	
	@Autowired
	private DepartmentMapper departmentMapper;
	
	@Autowired
	private DepartmentEmployeeMapper departmentEmployeeMapper;
	
	@Autowired
	private EmployeeServiceImpl employeeServiceImpl;
	public List<DepartmentInfoDto> getDepartmentList(SearchDepartmentCriteria criteria) {
		return transDepartmentRecordToDtos(departmentMapper.selectByCriteria(criteria));
	}

	public DepartmentInfoDto getDetail(Integer departmentId) {
		
		DepartmentInfoDto departmentInfoDto = null;
		if (departmentId != null) {
			Department department = departmentMapper.selectByPrimaryKey(departmentId);
			
			if (department !=null) {
				departmentInfoDto = transDepartmentRecordToDto(department);
			}
		}
		
		return departmentInfoDto;
	}

	public ResultDataDto insertDepartment(DepartmentInfoDto departmentInfoDto) throws Exception {
		ResultDataDto resultData = new ResultDataDto();
		Department department = null;
		try {
			departmentInfoDto.setCreatedById(1);
			departmentInfoDto.setModifyById(1);
			department = transDtoRecordToDepartment(departmentInfoDto);
			departmentMapper.insertSelective(department);
			
			resultData.setResultCode(SystemConstant.Code_OK);
			resultData.setResultMessage(String.format(SystemConstant.Msg_Department_Insert_OK, department.getId(), department.getDepartmentname()));
		} catch (Exception exp) {
			String rtnMsg = String.format(SystemConstant.Msg_Department_Insert_Err, department.getId(),  exp.toString());
			resultData.setResultCode(SystemConstant.Code_Department_Insert_Err);
			resultData.setResultMessage(rtnMsg);
			log.error(rtnMsg);
		}
		return resultData;
	}

	public ResultDataDto deleteDepartment(DepartmentInfoDto departmentInfoDto) throws Exception {
		ResultDataDto resultData = new ResultDataDto();
		try {
			DepartmentExample example = new DepartmentExample();
			DepartmentExample.Criteria criteria = example.createCriteria();
			criteria.andVersionIsNotNull();
			criteria.andVersionEqualTo(false);
			criteria.andIdIsNotNull();
			criteria.andIdEqualTo(departmentInfoDto.getId());
			criteria.andModifydatetimeIsNotNull();
			criteria.andModifydatetimeEqualTo(departmentInfoDto.getModifyDateTime());
			List<Department> records = departmentMapper.selectByExample(example);
			
			if (records == null || records.size() == 0 || records.get(0) == null) {
				resultData.setResultCode(SystemConstant.Code_GetDepartmentID_NotExisted);
				resultData.setResultMessage(String.format(SystemConstant.Msg_GetDepartmentID_NotExisted,departmentInfoDto.getId()));
				return resultData;
			}
			
			Department department  = null;
			department = records.get(0);
			Date date = new Date();
			department.setModifydatetime(date);
			department.setVersion(true);
			
			if (departmentMapper.updateByExampleSelective(department, example) < 1 ) {
				resultData.setResultCode(SystemConstant.Code_DBData_Update_Fail);
				resultData.setResultMessage(SystemConstant.Msg_DBData_Update_Fail);
				return resultData;
			}
			resultData.setResultCode(SystemConstant.Code_OK);
			resultData.setResultMessage(String.format(SystemConstant.Msg_Department_Delete_OK, department.getId(), department.getDepartmentname()));			

		} catch (Exception exp) {
			String rtnMsg = String.format(SystemConstant.Msg_Department_Delete_Err, departmentInfoDto.getId(),  exp.toString());
			resultData.setResultCode(SystemConstant.Code_Department_Delete_Err);
			resultData.setResultMessage(rtnMsg);
			log.error(rtnMsg);
		}
		return resultData;
	}

	public ResultDataDto updateDepartment(DepartmentInfoDto departmentInfoDto) throws Exception {
		ResultDataDto resultData = new ResultDataDto();
		
		try {
			DepartmentExample example = new DepartmentExample();
			DepartmentExample.Criteria criteria = example.createCriteria();
			criteria.andVersionIsNotNull();
			criteria.andVersionEqualTo(false);
			criteria.andIdIsNotNull();
			criteria.andIdEqualTo(departmentInfoDto.getId());
			criteria.andModifydatetimeIsNotNull();
			criteria.andModifydatetimeEqualTo(departmentInfoDto.getModifyDateTime());
			List<Department> records = departmentMapper.selectByExample(example);
			
			if (records == null || records.size() == 0 || records.get(0) == null) {
				resultData.setResultCode(SystemConstant.Code_GetDepartmentID_NotExisted);
				resultData.setResultMessage(String.format(SystemConstant.Msg_GetDepartmentID_NotExisted,departmentInfoDto.getId()));
				return resultData;
			}
			
			Department department  = null;
			department = records.get(0);
			Date date = new Date();
			department.setModifydatetime(date);
			department.setMobile(departmentInfoDto.getMobile());
			department.setDepartmentname(departmentInfoDto.getDepartmentname());
			
			if (departmentMapper.updateByExampleSelective(department, example) < 1 ) {
				resultData.setResultCode(SystemConstant.Code_DBData_Update_Fail);
				resultData.setResultMessage(SystemConstant.Msg_DBData_Update_Fail);
				return resultData;
			}
			resultData.setResultCode(SystemConstant.Code_OK);
			resultData.setResultMessage(String.format(SystemConstant.Msg_Department_Update_OK, department.getId(), department.getDepartmentname()));			

		} catch (Exception exp) {
			String rtnMsg = String.format(SystemConstant.Msg_Department_Update_Err, departmentInfoDto.getId(),  exp.toString());
			resultData.setResultCode(SystemConstant.Code_Department_Update_Err);
			resultData.setResultMessage(rtnMsg);
			log.error(rtnMsg);
		}
		return resultData;
	}

	public List<EmployeeInfoDto> getEmployeeList(SearchDepartmentCriteria criteria) {
		List<EmployeeInfoDto> list = new ArrayList<EmployeeInfoDto>();
		List<DepartmentEmployee> employeeList = departmentEmployeeMapper.EmployeeListByDepartmentId(criteria.getId());
		if (employeeList !=null && employeeList.size() > 0) {
			for (DepartmentEmployee employee : employeeList) {
				if (employee != null && employee.getEmlopyeeid() != null) {
					EmployeeInfoDto detail = employeeServiceImpl.getDetail(employee.getEmlopyeeid());
					if (detail != null) {
						list.add(detail);
					}
				}
			}
		}
		
		return list;
	}

	public int countDepartment(SearchDepartmentCriteria criteria) {
		return departmentMapper.countDepartment(criteria);
	}

	/**
	 * 数据转化
	 *    Department===》DepartmentInfoDto
	 * @param records
	 * @return
	 */
	private List<DepartmentInfoDto> transDepartmentRecordToDtos(List<Department> records) {
		
		List<DepartmentInfoDto> list = new ArrayList<DepartmentInfoDto>();
		if (records != null && records.size() > 0) {
			for (Department record : records) {
				if (record != null) {
					DepartmentInfoDto subjectInfoDto = transDepartmentRecordToDto(record);
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
	 *    Department===》DepartmentInfoDto
	 * @param records
	 * @return
	 */
	private DepartmentInfoDto transDepartmentRecordToDto(Department record) {
		DepartmentInfoDto departmentInfoDto = null;
		if (record != null) {
			departmentInfoDto = new DepartmentInfoDto();
			departmentInfoDto.setId(record.getId());
			departmentInfoDto.setDepartmentname(record.getDepartmentname());
			departmentInfoDto.setMobile(record.getMobile());
			departmentInfoDto.setCreatedById(record.getCreatedbyid());
			departmentInfoDto.setCreatedTime(record.getCreatedtime());
			departmentInfoDto.setModifyById(record.getModifybyid());
			departmentInfoDto.setModifyDateTime(record.getModifydatetime());
			departmentInfoDto.setVersion(record.getVersion());
			
		}
		
		return departmentInfoDto;
	}
	
	private Department transDtoRecordToDepartment(DepartmentInfoDto departmentInfoDto) {
		Department department =null;
		if (departmentInfoDto != null) {
			department = new Department();
			department.setId(departmentInfoDto.getId());
			department.setDepartmentname(departmentInfoDto.getDepartmentname());
			department.setMobile(departmentInfoDto.getMobile());
			department.setCreatedbyid(departmentInfoDto.getCreatedById());
//			department.setCreatedtime(departmentInfoDto.getCreatedtime());
			department.setModifybyid(departmentInfoDto.getModifyById());
//			department.setModifydatetime(departmentInfoDto.getModifydatetime());
//			department.setVersion(departmentInfoDto.getVersion());
			
		}
		return department;
	}
}
