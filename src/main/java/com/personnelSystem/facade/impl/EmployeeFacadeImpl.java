package com.personnelSystem.facade.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.personnelSystem.dto.admin.EmployeeInfoDto;
import com.personnelSystem.dto.criteria.SearchEmployeeCriteria;
import com.personnelSystem.facade.EmployeeFacade;
import com.personnelSystem.service.EmployeeService;
import com.personnelSystem.util.PaginatedList;
import com.personnelSystem.util.ResultDataDto;

@Service
public class EmployeeFacadeImpl implements EmployeeFacade{

	@Autowired
	private EmployeeService employeeService;
	
	public PaginatedList<EmployeeInfoDto> listEmployeeDto(SearchEmployeeCriteria Criteria) {
		PaginatedList<EmployeeInfoDto>  resourceDtos = new PaginatedList<EmployeeInfoDto>();
		List<EmployeeInfoDto> list = new ArrayList<EmployeeInfoDto>();

		if (null != Criteria && 0 != Criteria.getPagesize()) {

			int total = employeeService.count(Criteria);

			Criteria.setTotal(total);

			if (0 < total) {
				list = employeeService.listEmployeeInfoDto(Criteria);
			}
		} else {
			list = employeeService.listEmployeeInfoDto(Criteria);
		}
		
		resourceDtos.setPagination(Criteria);
		resourceDtos.setRows(list);
		return resourceDtos;
	}

	public EmployeeInfoDto getDetail(Integer Id) {
		return employeeService.getDetail(Id);
	}

	public ResultDataDto insert(EmployeeInfoDto employee) throws Exception {
		return employeeService.insert(employee);
	}

	public ResultDataDto delete(EmployeeInfoDto employee) throws Exception {
		return employeeService.delete(employee);
	}

	public ResultDataDto update(EmployeeInfoDto employee) throws Exception {
		return employeeService.update(employee);
	}

	@Override
	public EmployeeInfoDto getEmployee(EmployeeInfoDto employee) {
		return employeeService.getEmployee(employee);
	}


}
