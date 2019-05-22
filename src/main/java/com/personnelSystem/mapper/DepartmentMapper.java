package com.personnelSystem.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.personnelSystem.dto.criteria.SearchDepartmentCriteria;
import com.personnelSystem.entity.Department;
import com.personnelSystem.entity.DepartmentExample;

public interface DepartmentMapper {
    long countByExample(DepartmentExample example);

	int deleteByExample(DepartmentExample example);

	int deleteByPrimaryKey(Integer id);

	int insert(Department record);

	int insertSelective(Department record);

	List<Department> selectByExample(DepartmentExample example);

	List<Department> selectAll();

	Department selectByPrimaryKey(Integer id);

	int updateByExampleSelective(@Param("record") Department record, @Param("example") DepartmentExample example);

	int updateByExample(@Param("record") Department record, @Param("example") DepartmentExample example);

	int updateByPrimaryKeySelective(Department record);

	int updateByPrimaryKey(Department record);
    
    List<Department> selectByCriteria(SearchDepartmentCriteria criteria);
    
    int countDepartment(SearchDepartmentCriteria criteria);
}