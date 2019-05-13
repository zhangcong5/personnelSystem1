package com.personnelSystem.mapper;

import com.personnelSystem.entity.AAEmployeeRole;
import com.personnelSystem.entity.AAEmployeeRoleExample;
import com.personnelSystem.entity.AAEmployeeRoleKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AAEmployeeRoleMapper {
    long countByExample(AAEmployeeRoleExample example);

    int deleteByExample(AAEmployeeRoleExample example);

    int deleteByPrimaryKey(AAEmployeeRoleKey key);

    int insert(AAEmployeeRole record);

    int insertSelective(AAEmployeeRole record);

    List<AAEmployeeRole> selectByExample(AAEmployeeRoleExample example);

    AAEmployeeRole selectByPrimaryKey(AAEmployeeRoleKey key);

    int updateByExampleSelective(@Param("record") AAEmployeeRole record, @Param("example") AAEmployeeRoleExample example);

    int updateByExample(@Param("record") AAEmployeeRole record, @Param("example") AAEmployeeRoleExample example);

    int updateByPrimaryKeySelective(AAEmployeeRole record);

    int updateByPrimaryKey(AAEmployeeRole record);
}