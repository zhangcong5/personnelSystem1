package com.personnelSystem.mapper;

import com.personnelSystem.entity.AAEmployee;
import com.personnelSystem.entity.AAEmployeeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AAEmployeeMapper {
    long countByExample(AAEmployeeExample example);

    int deleteByExample(AAEmployeeExample example);

    int deleteByPrimaryKey(Integer employeeId);

    int insert(AAEmployee record);

    int insertSelective(AAEmployee record);

    List<AAEmployee> selectByExample(AAEmployeeExample example);

    AAEmployee selectByPrimaryKey(Integer employeeId);

    int updateByExampleSelective(@Param("record") AAEmployee record, @Param("example") AAEmployeeExample example);

    int updateByExample(@Param("record") AAEmployee record, @Param("example") AAEmployeeExample example);

    int updateByPrimaryKeySelective(AAEmployee record);

    int updateByPrimaryKey(AAEmployee record);
}