package com.personnelSystem.util;

public class WebCommUtil {
	/**
	 * 失败返回
	 * @param message 消息
	 * @return ApiResponse
	 */
	public static <T> ApiResponse<T> getFailApiResponse(String message) {
		ApiResponse<T> response = new ApiResponse<T>();
		response.setSuccess(false);
		response.setCode("500");
		response.setMessage(message);
		return response;
	}
	
	/**
	 * 失败返回
	 * @param message 消息
	 * @param body 返回信息
	 * @return ApiResponse
	 */
	public static <T> ApiResponse<T> getFailApiResponse(String message, T body) {
		ApiResponse<T> response = new ApiResponse<T>();
		response.setSuccess(false);
		response.setCode("500");
		response.setMessage(message);
		response.setBody(body);
		return response;
	}

	/**
	 * 失败返回
	 * @param body 返回信息
	 * @return ApiResponse
	 */
	public static <T> ApiResponse<T> getFailApiResponse(T body) {
		ApiResponse<T> response = new ApiResponse<T>();
		response.setSuccess(false);
		response.setCode("500");
		response.setBody(body);
		return response;
	}
	
	/**
	 * 成功返回
	 * @param body 返回信息
	 * @return ApiResponse
	 */
	public static <T> ApiResponse<T> getSuccessApiResponse(T body) {
		ApiResponse<T> response = new ApiResponse<T>();
		response.setSuccess(true);
		response.setCode("200");
		response.setBody(body);
		return response;
	}

	/**
	 * 成功返回
	 * @param message 消息
	 * @param body 返回信息
	 * @return ApiResponse
	 */
	public static <T> ApiResponse<T> getSuccessApiResponse(String message, T body) {
		ApiResponse<T> response = new ApiResponse<T>();
		response.setSuccess(true);
		response.setCode("200");
		response.setMessage(message);
		response.setBody(body);
		return response;
	}
}
