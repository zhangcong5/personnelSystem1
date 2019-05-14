package com.personnelSystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.personnelSystem.dto.admin.DepartmentInfoDto;
import com.personnelSystem.dto.admin.EmployeeInfoDto;
import com.personnelSystem.dto.criteria.SearchDepartmentCriteria;
import com.personnelSystem.facade.DepartmentFacade;
import com.personnelSystem.util.ApiResponse;
import com.personnelSystem.util.PaginatedList;
import com.personnelSystem.util.ResultDataDto;
import com.personnelSystem.util.SystemConstant;
import com.personnelSystem.util.WebCommUtil;

@Controller
@RequestMapping(value = "/department", method = RequestMethod.POST, produces = "application/json;charset=utf-8")
public class DepartmentController {

	@Autowired
	private DepartmentFacade departmentFacade;
	
	@RequestMapping("/list")
	@ResponseBody
	public PaginatedList<DepartmentInfoDto> getList(SearchDepartmentCriteria request){
		PaginatedList<DepartmentInfoDto> list = departmentFacade.getDepartmentList(request);
		return list;
	}
	
	@RequestMapping("/listemployee")
	@ResponseBody
	public ApiResponse<PaginatedList<EmployeeInfoDto>> getListEmployee(SearchDepartmentCriteria request) {
    	ApiResponse<PaginatedList<EmployeeInfoDto>> apiResponse = new ApiResponse<>();
    	if (request == null || request == null || request.getId() == null) {
    		return WebCommUtil.getFailApiResponse(SystemConstant.Msg_Request_Null);
		}
		
		try {
			apiResponse = WebCommUtil.getSuccessApiResponse(SystemConstant.Select_Success, departmentFacade.getEmployeeList(request));
		} catch(Exception exp) {
			apiResponse.setCode(SystemConstant.Code_GetDepartment_DbErr);
			apiResponse.setMsg(String.format(SystemConstant.Msg_GetDepartment_DbErr, exp.getMessage()));	
		}
		
		return apiResponse;
	}
	
	@RequestMapping("/detail")
	@ResponseBody
	public ApiResponse<DepartmentInfoDto> getDetail(SearchDepartmentCriteria request) {
    	ApiResponse<DepartmentInfoDto> apiResponse = new ApiResponse<>();
    	if (request == null || request == null || request.getId() == null) {
    		return WebCommUtil.getFailApiResponse(SystemConstant.Msg_Request_Null);
		}
    
		try {
			apiResponse = WebCommUtil.getSuccessApiResponse(departmentFacade.getDetail(request.getId()));
		} catch(Exception exp) {
			apiResponse.setCode(SystemConstant.Code_GetDepartment_DbErr);
			apiResponse.setMsg(String.format(SystemConstant.Msg_GetDepartment_DbErr, exp.getMessage()));
		}
		
		return apiResponse;
	}
	
	@RequestMapping("/insert")
	@ResponseBody
	public ApiResponse<ResultDataDto> insertDepartment(DepartmentInfoDto request) throws Exception {
		
		if (request == null || request == null) {
			return WebCommUtil.getFailApiResponse(SystemConstant.Msg_Request_Null);
		}
		
		ApiResponse<ResultDataDto> response = new ApiResponse<ResultDataDto>();

		try {
			ResultDataDto resultDataDto = departmentFacade.insertDepartment(request);
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
	public ApiResponse<ResultDataDto> UpdateDepartmentList(DepartmentInfoDto request) throws Exception {
		if (request == null || request == null) {
			return WebCommUtil.getFailApiResponse(SystemConstant.Msg_Request_Null);
		}
		
		ApiResponse<ResultDataDto> response = new ApiResponse<ResultDataDto>();

		try {
			ResultDataDto resultDataDto = departmentFacade.updateDepartment(request);
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
	public ApiResponse<ResultDataDto> deteleDepartmentList(DepartmentInfoDto request) throws Exception {
			if (request == null || request == null) {
				return WebCommUtil.getFailApiResponse(SystemConstant.Msg_Request_Null);
			}
			
			ApiResponse<ResultDataDto> response = new ApiResponse<ResultDataDto>();

			try {
				ResultDataDto resultDataDto = departmentFacade.deleteDepartment(request);
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
