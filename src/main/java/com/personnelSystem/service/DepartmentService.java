package com.personnelSystem.service;

import java.util.List;

import com.personnelSystem.dto.admin.DepartmentInfoDto;
import com.personnelSystem.dto.admin.EmployeeInfoDto;
import com.personnelSystem.dto.criteria.SearchDepartmentCriteria;
import com.personnelSystem.util.ResultDataDto;

public interface DepartmentService {
	public List<DepartmentInfoDto> getDepartmentList(SearchDepartmentCriteria Criteria);
	public DepartmentInfoDto getDetail(Integer departmentId);		
	public ResultDataDto insertDepartment(DepartmentInfoDto department) throws Exception;
	public ResultDataDto deleteDepartment(DepartmentInfoDto departmentInfoDto) throws Exception;
	public ResultDataDto updateDepartment(DepartmentInfoDto department) throws Exception;
	public List<EmployeeInfoDto> getEmployeeList(SearchDepartmentCriteria criteria);
	public int countDepartment(SearchDepartmentCriteria criteria);
}
