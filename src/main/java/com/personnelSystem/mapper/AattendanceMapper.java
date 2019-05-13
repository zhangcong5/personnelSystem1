package com.personnelSystem.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.personnelSystem.dto.criteria.SearchAattendanceCriteria;
import com.personnelSystem.entity.Aattendance;
import com.personnelSystem.entity.AattendanceExample;

public interface AattendanceMapper {
    long countByExample(AattendanceExample example);

    int deleteByExample(AattendanceExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Aattendance record);

    int insertSelective(Aattendance record);

    List<Aattendance> selectByExample(AattendanceExample example);

    Aattendance selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Aattendance record, @Param("example") AattendanceExample example);

    int updateByExample(@Param("record") Aattendance record, @Param("example") AattendanceExample example);

    int updateByPrimaryKeySelective(Aattendance record);

    int updateByPrimaryKey(Aattendance record);
    
	List<Aattendance> listAattendance(SearchAattendanceCriteria criteria);
	
	int countAattendance(SearchAattendanceCriteria criteria);
}