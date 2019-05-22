package com.personnelSystem.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.personnelSystem.dto.admin.AattendanceDto;
import com.personnelSystem.dto.criteria.SearchAattendanceCriteria;
import com.personnelSystem.entity.Aattendance;
import com.personnelSystem.entity.AattendanceExample;
import com.personnelSystem.mapper.AattendanceMapper;
import com.personnelSystem.service.AattendanceService;
import com.personnelSystem.util.ResultDataDto;
import com.personnelSystem.util.SystemConstant;

@Service
public class AattendanceServiceImpl implements AattendanceService{
	
	private static Logger log = LoggerFactory.getLogger(AattendanceServiceImpl.class);
	
	@Autowired 
	private AattendanceMapper aattendanceMapper;

	public List<AattendanceDto> listAattendanceInfoDto(SearchAattendanceCriteria criteria) {
		return transAattendanceRecordToDtos(aattendanceMapper.listAattendance(criteria));
	}

	public ResultDataDto insert(AattendanceDto aattendanceDto) throws Exception {
		ResultDataDto resultData = new ResultDataDto();
		Aattendance aattendance = null;
		try {
			aattendance = transDtoRecordToAattendance(aattendanceDto);
			aattendanceMapper.insertSelective(aattendance);
			
			resultData.setResultCode(SystemConstant.Code_OK);
			resultData.setResultMessage(String.format(SystemConstant.Msg_Aattendance_Insert_OK, aattendance.getId(), aattendance.getContent()));			
			
		} catch (Exception exp) {
			String rtnMsg = String.format(SystemConstant.Msg_Aattendance_Insert_Err, aattendance.getId(),  exp.toString());
			resultData.setResultCode(SystemConstant.Code_Aattendance_Insert_Err);
			resultData.setResultMessage(rtnMsg);
			log.error(rtnMsg);
		}
		return resultData;
	}

	public ResultDataDto update(AattendanceDto aattendanceDto) throws Exception {
		ResultDataDto resultData = new ResultDataDto();
		try {
			AattendanceExample example = new AattendanceExample();
			AattendanceExample.Criteria criteria = example.createCriteria();
			criteria.andIdIsNotNull();
			criteria.andIdEqualTo(aattendanceDto.getId());
			List<Aattendance> records = aattendanceMapper.selectByExample(example);
			
			if (records == null || records.size() == 0 || records.get(0) == null) {
				resultData.setResultCode(SystemConstant.Code_GetAattendanceID_NotExisted);
				resultData.setResultMessage(String.format(SystemConstant.Msg_GetAattendanceID_NotExisted,aattendanceDto.getId()));
				return resultData;
			}
			
			Aattendance aattendance =null;
			aattendance = records.get(0);
			aattendance.setState(aattendanceDto.getState());
			
			if (aattendanceMapper.updateByExampleSelective(aattendance, example) < 1 ) {
				resultData.setResultCode(SystemConstant.Code_DBData_Update_Fail);
				resultData.setResultMessage(SystemConstant.Msg_DBData_Update_Fail);
				return resultData;
			}
			resultData.setResultCode(SystemConstant.Code_OK);
			resultData.setResultMessage(String.format(SystemConstant.Msg_Aattendance_Update_OK, aattendance.getId(), aattendance.getContent()));			

		} catch (Exception exp) {
			String rtnMsg = String.format(SystemConstant.Msg_Aattendance_Update_Err, aattendanceDto.getId(),  exp.toString());
			resultData.setResultCode(SystemConstant.Code_Aattendance_Update_Err);
			resultData.setResultMessage(rtnMsg);
			log.error(rtnMsg);
		}
		return resultData;
	}

	public int count(SearchAattendanceCriteria Criteria) {
		return aattendanceMapper.countAattendance(Criteria);
	}

	/**
	 * 数据转化
	 *     Aattendance ==》 AattendanceDto
	 * @param records Aattendance
	 * @return AattendanceDto
	 */
	private List<AattendanceDto> transAattendanceRecordToDtos(List<Aattendance> records) {
		
		List<AattendanceDto> list = new ArrayList<AattendanceDto>();
		if (records != null && records.size() > 0) {
			for (Aattendance record : records) {
				if (record != null) {
					AattendanceDto subjectInfoDto = transAattendanceRecordToDto(record);
					
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
	 * Aattendance =====》 AattendanceDto
	 * @param Aattendance
	 * @return
	 */
	private AattendanceDto transAattendanceRecordToDto(Aattendance aattendance) {
		AattendanceDto aattendanceDto = null;
		if (aattendance != null) {
			aattendanceDto = new AattendanceDto();
			aattendanceDto.setId(aattendance.getId());
			aattendanceDto.setContent(aattendance.getContent());
			aattendanceDto.setStartingtime(aattendance.getStartingtime());
			aattendanceDto.setEndtime(aattendance.getEndtime());
			aattendanceDto.setNumber(aattendance.getNumber());
			aattendanceDto.setState(aattendance.getState());
			aattendanceDto.setType(aattendance.getType());
		}
		
		return aattendanceDto;
	}

	/**
	 *  数据转化
	 * AattendanceDto =====》 Aattendance
	 * @param aattendanceDto
	 * @return
	 */
	private Aattendance transDtoRecordToAattendance(AattendanceDto aattendanceDto) {
		Aattendance aattendance = null; 
		if (aattendanceDto!= null) {
			aattendance = new Aattendance();
			aattendance.setContent(aattendanceDto.getContent());
			aattendance.setEndtime(aattendanceDto.getEndtime());
			aattendance.setId(aattendanceDto.getId());
			aattendance.setNumber(aattendanceDto.getNumber());
			aattendance.setStartingtime(aattendanceDto.getStartingtime());
			aattendance.setState(aattendanceDto.getState());
			aattendance.setType(aattendanceDto.getType());
		}
		return aattendance;
	}
}
