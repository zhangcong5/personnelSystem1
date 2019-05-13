package com.personnelSystem.facade;

import com.personnelSystem.dto.admin.DepartmentInfoDto;
import com.personnelSystem.dto.admin.EmployeeInfoDto;
import com.personnelSystem.dto.criteria.SearchDepartmentCriteria;
import com.personnelSystem.dto.criteria.SearchEmployeeCriteria;
import com.personnelSystem.util.PaginatedList;
import com.personnelSystem.util.ResultDataDto;

public interface DepartmentFacade {
	public PaginatedList<DepartmentInfoDto> getDepartmentList(SearchDepartmentCriteria criteria);
	public DepartmentInfoDto getDetail(Integer Id);		
	public ResultDataDto insertDepartment(DepartmentInfoDto departmentDto) throws Exception;
	public ResultDataDto deleteDepartment(DepartmentInfoDto departmentInfoDto) throws Exception;
	public ResultDataDto updateDepartment(DepartmentInfoDto departmentDto) throws Exception;
	public PaginatedList<EmployeeInfoDto> getEmployeeList(SearchDepartmentCriteria criteria);
	public int count(SearchDepartmentCriteria Criteria);
}
