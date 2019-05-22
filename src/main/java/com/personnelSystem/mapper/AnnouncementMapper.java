package com.personnelSystem.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.personnelSystem.dto.criteria.SearchAnnouncementCriteria;
import com.personnelSystem.entity.Announcement;
import com.personnelSystem.entity.AnnouncementExample;

public interface AnnouncementMapper {

	long countByExample(AnnouncementExample example);

    int deleteByExample(AnnouncementExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Announcement record);

    int insertSelective(Announcement record);

    List<Announcement> selectByExample(AnnouncementExample example);

    Announcement selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Announcement record, @Param("example") AnnouncementExample example);

    int updateByExample(@Param("record") Announcement record, @Param("example") AnnouncementExample example);

    int updateByPrimaryKeySelective(Announcement record);

    int updateByPrimaryKey(Announcement record);
    
	List<Announcement> listAnnouncement(SearchAnnouncementCriteria criteria);
	
	int countAnnouncement(SearchAnnouncementCriteria criteria);
}