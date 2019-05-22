package com.personnelSystem.facade.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.personnelSystem.dto.admin.DepartmentInfoDto;
import com.personnelSystem.dto.admin.EmployeeInfoDto;
import com.personnelSystem.dto.criteria.SearchDepartmentCriteria;
import com.personnelSystem.entity.Employee;
import com.personnelSystem.facade.DepartmentFacade;
import com.personnelSystem.service.DepartmentService;
import com.personnelSystem.util.PaginatedList;
import com.personnelSystem.util.ResultDataDto;

@Service
public class DepartmentFacadeImpl implements DepartmentFacade{

	@Autowired 
	private DepartmentService departmentService;
	
	public List<DepartmentInfoDto> getDepartmentList(SearchDepartmentCriteria criteria) {
		
		List<DepartmentInfoDto> list = new ArrayList<DepartmentInfoDto>();

		if (null != criteria && 0 != criteria.getPagesize()) {

			int total = departmentService.countDepartment(criteria);

			criteria.setTotal(total);

			if (0 < total) {
				list = departmentService.getDepartmentList(criteria);;
			}
		} else {
			list = departmentService.getDepartmentList(criteria);
		}
		
		return list;
		
		
	}

	@Override
	public List<DepartmentInfoDto> getAllDepartment() {
		return departmentService.getAllDepartment();
	}

	public DepartmentInfoDto getDetail(Integer departmentId) {
		return departmentService.getDetail(departmentId);
	}

	public ResultDataDto insertDepartment(DepartmentInfoDto department) throws Exception {
		return departmentService.insertDepartment(department);
	}

	public ResultDataDto deleteDepartment(DepartmentInfoDto departmentInfoDto) throws Exception {
		return departmentService.deleteDepartment(departmentInfoDto);
	}

	public ResultDataDto updateDepartment(DepartmentInfoDto department) throws Exception {
		return departmentService.updateDepartment(department);
	}

	public PaginatedList<EmployeeInfoDto> getEmployeeList(SearchDepartmentCriteria criteria) {
		
		PaginatedList<EmployeeInfoDto>  resourceDtos = new PaginatedList<EmployeeInfoDto>();
		List<EmployeeInfoDto> list = new ArrayList<EmployeeInfoDto>();

		if (null != criteria && 0 != criteria.getPagesize()) {

			int total = departmentService.countDepartment(criteria);

			criteria.setTotal(total);

			if (0 < total) {
				list = departmentService.getEmployeeList(criteria);;
			}
		} else {
			list = departmentService.getEmployeeList(criteria);
		}
		
		resourceDtos.setPagination(criteria);
		resourceDtos.setRows(list);
		return resourceDtos;
	}

	@Override
	public int count(SearchDepartmentCriteria Criteria) {
		// TODO Auto-generated method stub
		return 0;
	}

}
