package com.personnelSystem.facade;

import java.util.List;

import com.personnelSystem.dto.admin.AnnouncementDto;
import com.personnelSystem.dto.criteria.SearchAnnouncementCriteria;
import com.personnelSystem.util.ResultDataDto;

public interface AnnouncementFacade {
	
	/**
	 * 根据条件查询公告数据对象列表
	 * @param Criteria
	 * @return
	 */
	public List<AnnouncementDto> getAnnouncementList(SearchAnnouncementCriteria Criteria);
	
	/**
	 * 增加公告数据信息
	 * @param Announcement
	 * @throws Exception 
	 */
	public ResultDataDto insertAnnouncement(AnnouncementDto Announcement) throws Exception;
	
	/**
	 * 编辑公告数据信息
	 * @param Announcement
	 * @return
	 * @throws Exception 
	 */
	public ResultDataDto updateAnnouncement(AnnouncementDto Announcement) throws Exception;
	
	/**
	 * 公告详情
	 * @param Id
	 * @return
	 */
	public AnnouncementDto getDetail(Integer Id);	
	
	/**
	 * 删除信息
	 * @param id
	 * @return
	 * @throws Exception 
	 */
	public ResultDataDto deleteAnnouncement(AnnouncementDto Announcement) throws Exception;
	
}
