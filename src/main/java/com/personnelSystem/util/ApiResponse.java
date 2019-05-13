package com.personnelSystem.util;

import java.io.Serializable;

public class ApiResponse<T> implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * 接口调用返回是否成功
	 */
	private boolean success;

	/**
	 * 接口调用返回消息
	 */
	private String message;

	/**
	 * 接口调用返回代码
	 */
	private String code;

	/**
	 * 接口调用返回内容
	 */
	private T body;

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public T getBody() {
		return body;
	}

	public void setBody(T body) {
		this.body = body;
	}

	@Override
	public String toString() {
		return "ApiResponse [success=" + success + ", message=" + message + ", code=" + code + ", body=" + body + "]";
	}

}

