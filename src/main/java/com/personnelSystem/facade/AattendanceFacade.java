package com.personnelSystem.facade;

import com.personnelSystem.dto.admin.AattendanceDto;
import com.personnelSystem.dto.criteria.SearchAattendanceCriteria;
import com.personnelSystem.util.PaginatedList;
import com.personnelSystem.util.ResultDataDto;

public interface AattendanceFacade {
	
	/**
	 * 根据条件查询考勤数据对象列表
	 * @param Criteria
	 * @return
	 */
	public PaginatedList<AattendanceDto> listAattendanceDto(SearchAattendanceCriteria Criteria);
	
	/**
	 * 增加考勤数据信息
	 * @param aattendance
	 * @throws Exception 
	 */
	public ResultDataDto insert(AattendanceDto aattendance) throws Exception;
	
	/**
	 * 编辑考勤数据信息
	 * @param aattendance
	 * @return
	 * @throws Exception 
	 */
	public ResultDataDto update(AattendanceDto aattendance) throws Exception;
}
