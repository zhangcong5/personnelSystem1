package com.personnelSystem.facade.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.personnelSystem.dto.admin.AattendanceDto;
import com.personnelSystem.dto.criteria.SearchAattendanceCriteria;
import com.personnelSystem.facade.AattendanceFacade;
import com.personnelSystem.service.AattendanceService;
import com.personnelSystem.util.PaginatedList;
import com.personnelSystem.util.ResultDataDto;

@Service
public class AattendanceFacadeImpl implements AattendanceFacade{

	@Autowired
	private AattendanceService aattendanceService;

	public PaginatedList<AattendanceDto> listAattendanceDto(SearchAattendanceCriteria Criteria) {
		PaginatedList<AattendanceDto>  resourceDtos = new PaginatedList<AattendanceDto>();
		List<AattendanceDto> list = new ArrayList<AattendanceDto>();

		if (null != Criteria && 0 != Criteria.getPagesize()) {

			int total = aattendanceService.count(Criteria);

			Criteria.setTotal(total);

			if (0 < total) {
				list = aattendanceService.listAattendanceInfoDto(Criteria);
			}
		} else {
			list = aattendanceService.listAattendanceInfoDto(Criteria);
		}
		
		resourceDtos.setPagination(Criteria);
		resourceDtos.setRows(list);
		return resourceDtos;
	}

	public ResultDataDto insert(AattendanceDto aattendance) throws Exception {
		return aattendanceService.insert(aattendance);
	}

	public ResultDataDto update(AattendanceDto aattendance) throws Exception {
		return aattendanceService.update(aattendance);
	}


}
