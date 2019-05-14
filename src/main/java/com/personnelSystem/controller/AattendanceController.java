package com.personnelSystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.personnelSystem.dto.admin.AattendanceDto;
import com.personnelSystem.dto.criteria.SearchAattendanceCriteria;
import com.personnelSystem.facade.AattendanceFacade;
import com.personnelSystem.util.ApiResponse;
import com.personnelSystem.util.PaginatedList;
import com.personnelSystem.util.ResultDataDto;
import com.personnelSystem.util.SystemConstant;
import com.personnelSystem.util.WebCommUtil;

@Controller
@RequestMapping(value = "/attendance", method = RequestMethod.POST, produces = "application/json;charset=utf-8")
public class AattendanceController {
	@Autowired
	private AattendanceFacade AattendanceFacade;
	
	@RequestMapping("/list")
	@ResponseBody
	public PaginatedList<AattendanceDto> getList(SearchAattendanceCriteria request){
		PaginatedList<AattendanceDto> list = AattendanceFacade.listAattendanceDto(request);
		return list;

	}
	
	@RequestMapping("/insert")
	@ResponseBody
	public ApiResponse<ResultDataDto> InsertAattendance(AattendanceDto request) throws Exception{
		if (request == null ) {
			return WebCommUtil.getFailApiResponse(SystemConstant.Msg_Request_Null);
		}
		
		ApiResponse<ResultDataDto> response = new ApiResponse<ResultDataDto>();

		try {
			ResultDataDto resultDataDto = AattendanceFacade.insert(request);
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
	public ApiResponse<ResultDataDto> UpdateAattendance(AattendanceDto request) throws Exception{
		if (request == null ) {
			return WebCommUtil.getFailApiResponse(SystemConstant.Msg_Request_Null);
		}
		
		ApiResponse<ResultDataDto> response = new ApiResponse<ResultDataDto>();

		try {
			ResultDataDto resultDataDto = AattendanceFacade.update(request);
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
