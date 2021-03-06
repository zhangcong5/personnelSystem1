package com.personnelSystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.personnelSystem.dto.admin.EmployeeInfoDto;
import com.personnelSystem.dto.criteria.SearchEmployeeCriteria;
import com.personnelSystem.facade.EmployeeFacade;
import com.personnelSystem.service.EmployeeService;
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
	@Autowired
	private EmployeeService employeeService;
	
	@RequestMapping("/list")
	@ResponseBody
	public ApiResponse<List<EmployeeInfoDto>> getList(SearchEmployeeCriteria request){
		ApiResponse<List<EmployeeInfoDto>> apiResponse = new ApiResponse<>();
		try {
			apiResponse = WebCommUtil.getSuccessApiResponse(employeeFacade.listEmployeeDto(request));
			if (null != request && 0 != request.getPagesize()) {
				apiResponse.setCount(employeeService.count(request));
			}
		} catch(Exception exp) {
			apiResponse.setCode(SystemConstant.Code_GetEmployee_DbErr);
			apiResponse.setMsg(String.format(SystemConstant.Msg_GetEmployee_DbErr, exp.getMessage()));
		}
		
		return apiResponse;
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

	@RequestMapping("/login")
	@ResponseBody
	public ApiResponse<EmployeeInfoDto> getEmployee(EmployeeInfoDto request){
		ApiResponse<EmployeeInfoDto> apiResponse = new ApiResponse<>();
		if (null == request   || null ==  request.getId()|| null == request.getPassword()) {
			return WebCommUtil.getFailApiResponse(SystemConstant.Msg_Request_Null);
		}

		try {
			apiResponse = WebCommUtil.getSuccessApiResponse(employeeFacade.getEmployee(request));
		} catch(Exception exp) {
			apiResponse.setCode(SystemConstant.Code_GetEmployee_DbErr);
			apiResponse.setMsg(String.format(SystemConstant.Msg_GetEmployee_DbErr, exp.getMessage()));
		}

		return apiResponse;
	}

	@RequestMapping("/personnelList")
	@ResponseBody
	public  ApiResponse<List<EmployeeInfoDto>> getPersonnelList(){
		ApiResponse<List<EmployeeInfoDto>> apiResponse = new ApiResponse<>();
		try {
			apiResponse = WebCommUtil.getSuccessApiResponse(employeeFacade.getEmployeeList());
		} catch(Exception exp) {
			apiResponse.setCode(SystemConstant.Code_GetEmployee_DbErr);
			apiResponse.setMsg(String.format(SystemConstant.Msg_GetEmployee_DbErr, exp.getMessage()));
		}

		return apiResponse;
	}
}
