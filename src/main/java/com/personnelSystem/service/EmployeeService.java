package com.personnelSystem.service;

import java.util.List;

import com.personnelSystem.dto.admin.EmployeeInfoDto;
import com.personnelSystem.dto.criteria.SearchEmployeeCriteria;
import com.personnelSystem.util.ResultDataDto;

public interface EmployeeService {
	
	/**
	 *  根据条件查询员工对象列表
	 * @param Criteria
	 * @return
	 */
	public List<EmployeeInfoDto> listEmployeeInfoDto(SearchEmployeeCriteria Criteria);
	
	/**
	 * 根据ID获取员工信息详情
	 * @param id
	 * @return
	 */
	public EmployeeInfoDto getDetail(Integer Id);
	
	/**
	 * 增加员工信息
	 * @param employee
	 * @throws Exception 
	 */
	public ResultDataDto insert(EmployeeInfoDto employee) throws Exception;
	
	/**
	 * 删除员工信息
	 * @param id
	 * @return
	 * @throws Exception 
	 */
	public ResultDataDto delete(EmployeeInfoDto employee) throws Exception;
	
	/**
	 * 编辑员工信息
	 * @param employee
	 * @return
	 * @throws Exception 
	 */
	public ResultDataDto update(EmployeeInfoDto employee) throws Exception;
	
	/**
	 * 员工信息数量
	 * @param Criteria
	 * @return
	 */
	public int count(SearchEmployeeCriteria Criteria);
}
