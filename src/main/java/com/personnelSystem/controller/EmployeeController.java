package com.personnelSystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.personnelSystem.dto.admin.EmployeeInfoDto;
import com.personnelSystem.dto.criteria.SearchEmployeeCriteria;
import com.personnelSystem.facade.EmployeeFacade;
import com.personnelSystem.util.ApiRequest;
import com.personnelSystem.util.ApiResponse;
import com.personnelSystem.util.PaginatedList;
import com.personnelSystem.util.ResultDataDto;
import com.personnelSystem.util.SystemConstant;
import com.personnelSystem.util.WebCommUtil;

@Controller
@RequestMapping(value = "/employee", method = RequestMethod.POST, produces = "application/json;charset=utf-8")
public class EmployeeController {
	@Autowired
	private EmployeeFacade employeeFacade;
	
	@RequestMapping("/list")
	@ResponseBody
	public PaginatedList<EmployeeInfoDto> getList(SearchEmployeeCriteria request){
		PaginatedList<EmployeeInfoDto> list = employeeFacade.listEmployeeDto(request);
		return list;

	}
	
	@RequestMapping("/detail")
	@ResponseBody
	public ApiResponse<EmployeeInfoDto> getDetail(SearchEmployeeCriteria request){
    	ApiResponse<EmployeeInfoDto> apiResponse = new ApiResponse<>();
    	if (request == null || request.getId() == null) {
    		return WebCommUtil.getFailApiResponse(SystemConstant.Msg_Request_Null);
		}
    
		try {
			apiResponse = WebCommUtil.getSuccessApiResponse(employeeFacade.getDetail(request.getId()));
		} catch(Exception exp) {
			apiResponse.setCode(SystemConstant.Code_GetEmployee_DbErr);
			apiResponse.setMsg(String.format(SystemConstant.Msg_GetEmployee_DbErr, exp.getMessage()));
		}
		
		return apiResponse;
	}
	
	@RequestMapping("/insert")
	@ResponseBody
	public ApiResponse<ResultDataDto> InsertEmployee(EmployeeInfoDto request) throws Exception{
		if (request == null ) {
			return WebCommUtil.getFailApiResponse(SystemConstant.Msg_Request_Null);
		}
		
		ApiResponse<ResultDataDto> response = new ApiResponse<ResultDataDto>();

		try {
			ResultDataDto resultDataDto = employeeFacade.insert(request);
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
	public ApiResponse<ResultDataDto> UpdateEmployee(EmployeeInfoDto request) throws Exception{
		if (request == null ) {
			return WebCommUtil.getFailApiResponse(SystemConstant.Msg_Request_Null);
		}
		
		ApiResponse<ResultDataDto> response = new ApiResponse<ResultDataDto>();

		try {
			ResultDataDto resultDataDto = employeeFacade.update(request);
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
	
	@RequestMapping("/delete")
	@ResponseBody
	public ApiResponse<ResultDataDto> DeleteEmployee(EmployeeInfoDto request) throws Exception{
		if (request == null ) {
			return WebCommUtil.getFailApiResponse(SystemConstant.Msg_Request_Null);
		}
		
		ApiResponse<ResultDataDto> response = new ApiResponse<ResultDataDto>();

		try {
			ResultDataDto resultDataDto = employeeFacade.delete(request);
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
