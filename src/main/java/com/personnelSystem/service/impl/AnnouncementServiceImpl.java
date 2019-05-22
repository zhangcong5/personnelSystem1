package com.personnelSystem.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import com.personnelSystem.entity.Employee;
import com.personnelSystem.mapper.EmployeeMapper;
import com.sun.imageio.plugins.common.I18N;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.personnelSystem.dto.admin.AnnouncementDto;
import com.personnelSystem.dto.criteria.SearchAnnouncementCriteria;
import com.personnelSystem.entity.Announcement;
import com.personnelSystem.entity.AnnouncementExample;
import com.personnelSystem.mapper.AnnouncementMapper;
import com.personnelSystem.service.AnnouncementService;
import com.personnelSystem.util.ResultDataDto;
import com.personnelSystem.util.SystemConstant;

@Service
public class AnnouncementServiceImpl implements AnnouncementService{
	
	private static Logger log = LoggerFactory.getLogger(AnnouncementServiceImpl.class);
	
	@Autowired
	private AnnouncementMapper announcementMapper;
	@Autowired
	private EmployeeMapper employeeMapper;
	
	@Autowired
	private EmployeeServiceImpl employeeServiceImpl;
	public List<AnnouncementDto> getAnnouncementList(SearchAnnouncementCriteria criteria) {
		ArrayList<Integer> list = new ArrayList<>();
		HashMap<Integer, String> map = new HashMap<>();
		List<Announcement> announcements = announcementMapper.listAnnouncement(criteria);
		for (Announcement announcement : announcements) {
			list.add(announcement.getCreatebyid());
			list.add(announcement.getModifybyid());
		}
		List<Employee> employees = employeeMapper.selectByIds(list);
		for (Employee employee : employees) {
			map.put(employee.getId(),employee.getNickname());
		}
		for (Announcement announcement:announcements) {
			announcement.setCreatebyName(map.get(announcement.getCreatebyid()));
			announcement.setModifybyName(map.get(announcement.getModifybyid()));
		}
		return transAnnouncementRecordToDtos(announcements);
	}

	public AnnouncementDto getDetail(Integer announcementId) {
		
		AnnouncementDto announcementDto = null;
		if (announcementId != null) {
			Announcement announcement = announcementMapper.selectByPrimaryKey(announcementId);
			
			if (announcement !=null) {
				announcementDto = transAnnouncementRecordToDto(announcement);
			}
		}
		
		return announcementDto;
	}

	public ResultDataDto insertAnnouncement(AnnouncementDto announcementDto) throws Exception {
		ResultDataDto resultData = new ResultDataDto();
		Announcement announcement = null;
		try {
			announcementDto.setCreatebyid(1);
			announcementDto.setModifybyid(1);
			announcement = transDtoRecordToAnnouncement(announcementDto);
			announcementMapper.insertSelective(announcement);
			
			resultData.setResultCode(SystemConstant.Code_OK);
			resultData.setResultMessage(String.format(SystemConstant.Msg_Announcement_Insert_OK, announcement.getId(), announcement.getTitle()));
		} catch (Exception exp) {
			String rtnMsg = String.format(SystemConstant.Msg_Announcement_Insert_Err, announcement.getId(),  exp.toString());
			resultData.setResultCode(SystemConstant.Code_Announcement_Insert_Err);
			resultData.setResultMessage(rtnMsg);
			log.error(rtnMsg);
		}
		return resultData;
	}

	public ResultDataDto deleteAnnouncement(AnnouncementDto announcementDto) throws Exception {
		ResultDataDto resultData = new ResultDataDto();
		try {
			AnnouncementExample example = new AnnouncementExample();
			AnnouncementExample.Criteria criteria = example.createCriteria();
			criteria.andVersionIsNotNull();
			criteria.andVersionEqualTo(false);
			criteria.andIdIsNotNull();
			criteria.andIdEqualTo(announcementDto.getId());
			criteria.andModifydatetimeIsNotNull();
			criteria.andModifydatetimeEqualTo(announcementDto.getModifydatetime());
			List<Announcement> records = announcementMapper.selectByExample(example);
			
			if (records == null || records.size() == 0 || records.get(0) == null) {
				resultData.setResultCode(SystemConstant.Code_GetAnnouncementID_NotExisted);
				resultData.setResultMessage(String.format(SystemConstant.Msg_GetAnnouncementID_NotExisted,announcementDto.getId()));
				return resultData;
			}
			
			Announcement announcement  = null;
			announcement = records.get(0);
			Date date = new Date();
			announcement.setModifydatetime(date);
			announcement.setVersion(true);
			
			if (announcementMapper.updateByExampleSelective(announcement, example) < 1 ) {
				resultData.setResultCode(SystemConstant.Code_DBData_Update_Fail);
				resultData.setResultMessage(SystemConstant.Msg_DBData_Update_Fail);
				return resultData;
			}
			resultData.setResultCode(SystemConstant.Code_OK);
			resultData.setResultMessage(String.format(SystemConstant.Msg_Announcement_Delete_OK, announcement.getId(), announcement.getTitle()));			

		} catch (Exception exp) {
			String rtnMsg = String.format(SystemConstant.Msg_Announcement_Delete_Err, announcementDto.getId(),  exp.toString());
			resultData.setResultCode(SystemConstant.Code_Announcement_Delete_Err);
			resultData.setResultMessage(rtnMsg);
			log.error(rtnMsg);
		}
		return resultData;
	}

	public ResultDataDto updateAnnouncement(AnnouncementDto announcementDto) throws Exception {
		ResultDataDto resultData = new ResultDataDto();
		
		try {
			AnnouncementExample example = new AnnouncementExample();
			AnnouncementExample.Criteria criteria = example.createCriteria();
			criteria.andVersionIsNotNull();
			criteria.andVersionEqualTo(false);
			criteria.andIdIsNotNull();
			criteria.andIdEqualTo(announcementDto.getId());
			criteria.andModifydatetimeIsNotNull();
			criteria.andModifydatetimeEqualTo(announcementDto.getModifydatetime());
			List<Announcement> records = announcementMapper.selectByExample(example);
			
			if (records == null || records.size() == 0 || records.get(0) == null) {
				resultData.setResultCode(SystemConstant.Code_GetAnnouncementID_NotExisted);
				resultData.setResultMessage(String.format(SystemConstant.Msg_GetAnnouncementID_NotExisted,announcementDto.getId()));
				return resultData;
			}
			
			Announcement announcement  = null;
			announcement = records.get(0);
			Date date = new Date();
			announcement.setModifydatetime(date);
			announcement.setTitle(announcementDto.getTitle());
			announcement.setState(announcementDto.getState());
			announcement.setContent(announcementDto.getContent());
			
			if (announcementMapper.updateByExampleSelective(announcement, example) < 1 ) {
				resultData.setResultCode(SystemConstant.Code_DBData_Update_Fail);
				resultData.setResultMessage(SystemConstant.Msg_DBData_Update_Fail);
				return resultData;
			}
			resultData.setResultCode(SystemConstant.Code_OK);
			resultData.setResultMessage(String.format(SystemConstant.Msg_Announcement_Update_OK, announcement.getId(), announcement.getTitle()));			

		} catch (Exception exp) {
			String rtnMsg = String.format(SystemConstant.Msg_Announcement_Update_Err, announcementDto.getId(),  exp.toString());
			resultData.setResultCode(SystemConstant.Code_Announcement_Update_Err);
			resultData.setResultMessage(rtnMsg);
			log.error(rtnMsg);
		}
		return resultData;
	}

	public int countAnnouncement(SearchAnnouncementCriteria criteria) {
		return announcementMapper.countAnnouncement(criteria);
	}

	/**
	 * 数据转化
	 *    announcement===》announcementDto
	 * @param records
	 * @return
	 */
	private List<AnnouncementDto> transAnnouncementRecordToDtos(List<Announcement> records) {
		
		List<AnnouncementDto> list = new ArrayList<AnnouncementDto>();
		if (records != null && records.size() > 0) {
			for (Announcement record : records) {
				if (record != null) {
					AnnouncementDto subjectInfoDto = transAnnouncementRecordToDto(record);
					if (subjectInfoDto != null) {
						list.add(subjectInfoDto);
					}
				}
			}
		}
		return list;
	}

	/**
	 * 数据转化
	 *    announcement===》announcementDto
	 * @param
	 * @return
	 */
	private AnnouncementDto transAnnouncementRecordToDto(Announcement record) {
		AnnouncementDto announcementDto = null;
		if (record != null) {
			announcementDto = new AnnouncementDto();
			announcementDto.setId(record.getId());
			announcementDto.setTitle(record.getTitle());
			announcementDto.setContent(record.getContent());
			announcementDto.setState(record.getState());
			announcementDto.setCreatebyid(record.getCreatebyid());
			announcementDto.setCreatebyName(record.getCreatebyName());
			announcementDto.setCreatetime(record.getCreatetime());
			announcementDto.setModifybyid(record.getModifybyid());
			announcementDto.setModifybyName(record.getModifybyName());
			announcementDto.setModifydatetime(record.getModifydatetime());
			announcementDto.setVersion(record.getVersion());
		}
		
		return announcementDto;
	}
	
	private Announcement transDtoRecordToAnnouncement(AnnouncementDto announcementDto) {
		Announcement announcement =null;
		if (announcementDto != null) {
			announcement = new Announcement();
			announcement.setId(announcementDto.getId());
			announcement.setTitle(announcementDto.getTitle());
			announcement.setContent(announcementDto.getContent());
			announcement.setState(announcementDto.getState());
			announcement.setCreatebyid(announcementDto.getCreatebyid());
			announcement.setCreatetime(announcementDto.getCreatetime());
			announcement.setModifybyid(announcementDto.getModifybyid());
			announcement.setModifydatetime(announcementDto.getModifydatetime());
			announcement.setVersion(announcementDto.getVersion());
		}
		return announcement;
	}

}
