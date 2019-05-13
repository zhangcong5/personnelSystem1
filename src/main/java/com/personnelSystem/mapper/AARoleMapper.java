package com.personnelSystem.mapper;

import com.personnelSystem.entity.AARole;
import com.personnelSystem.entity.AARoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AARoleMapper {
    long countByExample(AARoleExample example);

    int deleteByExample(AARoleExample example);

    int deleteByPrimaryKey(Integer roleId);

    int insert(AARole record);

    int insertSelective(AARole record);

    List<AARole> selectByExample(AARoleExample example);

    AARole selectByPrimaryKey(Integer roleId);

    int updateByExampleSelective(@Param("record") AARole record, @Param("example") AARoleExample example);

    int updateByExample(@Param("record") AARole record, @Param("example") AARoleExample example);

    int updateByPrimaryKeySelective(AARole record);

    int updateByPrimaryKey(AARole record);
}