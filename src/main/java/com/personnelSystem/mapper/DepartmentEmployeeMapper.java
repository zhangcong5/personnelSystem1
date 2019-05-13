package com.personnelSystem.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.personnelSystem.dto.criteria.SearchDepartmentCriteria;
import com.personnelSystem.entity.DepartmentEmployee;
import com.personnelSystem.entity.DepartmentEmployeeExample;
import com.personnelSystem.entity.DepartmentEmployeeKey;

public interface DepartmentEmployeeMapper {
    long countByExample(DepartmentEmployeeExample example);

	int deleteByExample(DepartmentEmployeeExample example);

	int deleteByPrimaryKey(DepartmentEmployeeKey key);

	int insert(DepartmentEmployee record);

	int insertSelective(DepartmentEmployee record);

	List<DepartmentEmployee> selectByExample(DepartmentEmployeeExample example);

	DepartmentEmployee selectByPrimaryKey(DepartmentEmployeeKey key);

	int updateByExampleSelective(@Param("record") DepartmentEmployee record,
			@Param("example") DepartmentEmployeeExample example);

	int updateByExample(@Param("record") DepartmentEmployee record,
			@Param("example") DepartmentEmployeeExample example);

	int updateByPrimaryKeySelective(DepartmentEmployee record);

	int updateByPrimaryKey(DepartmentEmployee record);
    
    /**
	* 根据员工id获取部门信息
	* @param employeeId
	* @return
	*/
	DepartmentEmployee getDepartmentInfo(Integer employeeId);
	
	/**
	 * 根据部门Id获取在该部门的员工Id 
	 * @param id
	 * @return
	 */
	List<DepartmentEmployee> EmployeeListByDepartmentId(Integer id);
	
}