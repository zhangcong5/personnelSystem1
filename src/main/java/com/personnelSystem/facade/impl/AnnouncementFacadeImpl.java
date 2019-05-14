package com.personnelSystem.facade.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.personnelSystem.dto.admin.AnnouncementDto;
import com.personnelSystem.dto.criteria.SearchAnnouncementCriteria;
import com.personnelSystem.facade.AnnouncementFacade;
import com.personnelSystem.service.AnnouncementService;
import com.personnelSystem.util.PaginatedList;
import com.personnelSystem.util.ResultDataDto;

@Service
public class AnnouncementFacadeImpl implements AnnouncementFacade{

	@Autowired 
	private AnnouncementService announcementService;
	
	public List<AnnouncementDto> getAnnouncementList(SearchAnnouncementCriteria criteria) {
		
		List<AnnouncementDto> list = new ArrayList<AnnouncementDto>();

		if (null != criteria && 0 != criteria.getPagesize()) {

			int total = announcementService.countAnnouncement(criteria);

			criteria.setTotal(total);

			if (0 < total) {
				list = announcementService.getAnnouncementList(criteria);;
			}
		} else {
			list = announcementService.getAnnouncementList(criteria);
		}
		
		return list;
	}

	public AnnouncementDto getDetail(Integer announcementId) {
		return announcementService.getDetail(announcementId);
	}

	public ResultDataDto insertAnnouncement(AnnouncementDto AnnouncementDto) throws Exception {
		return announcementService.insertAnnouncement(AnnouncementDto);
	}

	public ResultDataDto deleteAnnouncement(AnnouncementDto AnnouncementDto) throws Exception {
		return announcementService.deleteAnnouncement(AnnouncementDto);
	}

	public ResultDataDto updateAnnouncement(AnnouncementDto AnnouncementDto) throws Exception {
		return announcementService.updateAnnouncement(AnnouncementDto);
	}

}
