package com.personnelSystem.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.personnelSystem.dto.criteria.SearchEmployeeCriteria;
import com.personnelSystem.entity.Employee;
import com.personnelSystem.entity.EmployeeExample;

public interface EmployeeMapper {
    long countByExample(EmployeeExample example);

	int deleteByExample(EmployeeExample example);

	int deleteByPrimaryKey(Integer id);

	int insert(Employee record);

	int insertSelective(Employee record);

	List<Employee> selectByExample(EmployeeExample example);

	Employee selectByPrimaryKey(Integer id);

	int updateByExampleSelective(@Param("record") Employee record, @Param("example") EmployeeExample example);

	int updateByExample(@Param("record") Employee record, @Param("example") EmployeeExample example);

	int updateByPrimaryKeySelective(Employee record);

	int updateByPrimaryKey(Employee record);

    
 	/**
	 * 查询员工列表
	 * @param criteria 查询条件
	 * @return
	 */
	List<Employee> listEmployee(SearchEmployeeCriteria criteria);
	
	/**
	 *  根据条件查询员工的数量
	 * @param criteria 查询条件
	 * @return
	 */
	int countEmployee(SearchEmployeeCriteria criteria);
}