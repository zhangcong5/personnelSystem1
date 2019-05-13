package com.personnelSystem.mapper;

import com.personnelSystem.entity.AAResource;
import com.personnelSystem.entity.AAResourceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AAResourceMapper {
    long countByExample(AAResourceExample example);

    int deleteByExample(AAResourceExample example);

    int deleteByPrimaryKey(Integer resourceId);

    int insert(AAResource record);

    int insertSelective(AAResource record);

    List<AAResource> selectByExample(AAResourceExample example);

    AAResource selectByPrimaryKey(Integer resourceId);

    int updateByExampleSelective(@Param("record") AAResource record, @Param("example") AAResourceExample example);

    int updateByExample(@Param("record") AAResource record, @Param("example") AAResourceExample example);

    int updateByPrimaryKeySelective(AAResource record);

    int updateByPrimaryKey(AAResource record);
}