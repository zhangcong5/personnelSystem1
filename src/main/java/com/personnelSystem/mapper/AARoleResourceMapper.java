package com.personnelSystem.mapper;

import com.personnelSystem.entity.AARoleResource;
import com.personnelSystem.entity.AARoleResourceExample;
import com.personnelSystem.entity.AARoleResourceKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AARoleResourceMapper {
    long countByExample(AARoleResourceExample example);

    int deleteByExample(AARoleResourceExample example);

    int deleteByPrimaryKey(AARoleResourceKey key);

    int insert(AARoleResource record);

    int insertSelective(AARoleResource record);

    List<AARoleResource> selectByExample(AARoleResourceExample example);

    AARoleResource selectByPrimaryKey(AARoleResourceKey key);

    int updateByExampleSelective(@Param("record") AARoleResource record, @Param("example") AARoleResourceExample example);

    int updateByExample(@Param("record") AARoleResource record, @Param("example") AARoleResourceExample example);

    int updateByPrimaryKeySelective(AARoleResource record);

    int updateByPrimaryKey(AARoleResource record);
}