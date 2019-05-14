package com.personnelSystem.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;

import com.personnelSystem.entity.AAResource;
import com.personnelSystem.entity.AAResourceExample;

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
    
/*    int countResources(SearchResourceCriteria criteria);
    
    List<AAResource> listResources(SearchResourceCriteria criteria);

	String selectParentName(Integer resourceId);
	
	@MapKey("resourceId")
	Map<Long,AAResource> selectSubjectResource(SubjectResourceTypeDto subjectInfo);
	
	@MapKey("resourceId")
	Map<Long,AAResource> selectRoleResource(SubjectResourceTypeDto subjectInfo);
	*/
}