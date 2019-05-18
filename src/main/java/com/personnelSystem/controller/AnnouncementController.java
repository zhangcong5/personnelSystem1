package com.personnelSystem.controller;

import java.util.List;

import com.personnelSystem.facade.EmployeeFacade;
import com.personnelSystem.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.personnelSystem.dto.admin.AnnouncementDto;
import com.personnelSystem.dto.criteria.SearchAnnouncementCriteria;
import com.personnelSystem.facade.AnnouncementFacade;
import com.personnelSystem.service.AnnouncementService;
import com.personnelSystem.util.ApiResponse;
import com.personnelSystem.util.PaginatedList;
import com.personnelSystem.util.ResultDataDto;
import com.personnelSystem.util.SystemConstant;
import com.personnelSystem.util.WebCommUtil;


@Controller
@RequestMapping(value = "/announcement", method = RequestMethod.POST, produces = "application/json;charset=utf-8")
public class AnnouncementController {
	@Autowired
	private AnnouncementFacade announcementFacade;
	@Autowired 
	private AnnouncementService announcementService;

	
	@RequestMapping("/list")
	@ResponseBody
	public ApiResponse<List<AnnouncementDto>> getList(SearchAnnouncementCriteria request){
		ApiResponse<List<AnnouncementDto>> apiResponse = new ApiResponse<>();
		try {
			apiResponse = WebCommUtil.getSuccessApiResponse(announcementFacade.getAnnouncementList(request));
			if (null != request && 0 != request.getPagesize()) {
				apiResponse.setCount(announcementService.countAnnouncement(request));
			}
		} catch(Exception exp) {
			apiResponse.setCode(SystemConstant.Code_GetAnnouncement_DbErr);
			apiResponse.setMsg(String.format(SystemConstant.Msg_GetAnnouncement_DbErr, exp.getMessage()));
		}
		return apiResponse;
	}
	
	@RequestMapping("/detail")
	@ResponseBody
	public ApiResponse<AnnouncementDto> getDetail(SearchAnnouncementCriteria request) {
    	ApiResponse<AnnouncementDto> apiResponse = new ApiResponse<>();
    	if (request == null ||  request.getId() == null) {
    		return WebCommUtil.getFailApiResponse(SystemConstant.Msg_Request_Null);
		}
    
		try {
			apiResponse = WebCommUtil.getSuccessApiResponse(announcementFacade.getDetail(request.getId()));
		} catch(Exception exp) {
			apiResponse.setCode(SystemConstant.Code_GetAnnouncement_DbErr);
			apiResponse.setMsg(String.format(SystemConstant.Msg_GetAnnouncement_DbErr, exp.getMessage()));
		}
		
		return apiResponse;
	}
	
	@RequestMapping("/insert")
	@ResponseBody
	public ApiResponse<ResultDataDto> InsertAnnouncement(AnnouncementDto request) throws Exception{
		if (request == null ) {
			return WebCommUtil.getFailApiResponse(SystemConstant.Msg_Request_Null);
		}
		
		ApiResponse<ResultDataDto> response = new ApiResponse<ResultDataDto>();

		try {
			ResultDataDto resultDataDto = announcementFacade.insertAnnouncement(request);
			response.setData(resultDataDto);
			response.setCode(SystemConstant.Respose_Code_200);
			response.setSuccess(true);
			if (resultDataDto.getResultCode() != SystemConstant.Code_OK) {
				response.setCode(resultDataDto.getResultCode());
				response.setSuccess(false);
			}
			response.setMsg(resultDataDto.getResultMessage());	
		} catch(Exception exp) {
			return WebCommUtil.getFailApiResponse(exp.getMessage());
		}
		
		return response;
	}
	
	@RequestMapping("/update")
	@ResponseBody
	public ApiResponse<ResultDataDto> UpdateAnnouncement(AnnouncementDto request) throws Exception{
		if (request == null ) {
			return WebCommUtil.getFailApiResponse(SystemConstant.Msg_Request_Null);
		}
		
		ApiResponse<ResultDataDto> response = new ApiResponse<ResultDataDto>();

		try {
			ResultDataDto resultDataDto = announcementFacade.updateAnnouncement(request);
			response.setData(resultDataDto);
			response.setCode(SystemConstant.Respose_Code_200);
			response.setSuccess(true);
			if (resultDataDto.getResultCode() != SystemConstant.Code_OK) {
				response.setCode(resultDataDto.getResultCode());
				response.setSuccess(false);
			}
			response.setMsg(resultDataDto.getResultMessage());	
		} catch(Exception exp) {
			return WebCommUtil.getFailApiResponse(exp.getMessage());
		}
		
		return response;
		
	}
	
}
