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
	private String msg;

	/**
	 * 接口调用返回代码
	 */
	private String code;

	/**
	 * 接口调用返回内容
	 */
	private T data;
	
	/**
	 * 接口调用返回内容
	 */
	private int count;

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}


	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}


	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	@Override
	public String toString() {
		return "ApiResponse [success=" + success + ", msg=" + msg + ", code=" + code + ", data=" + data + ", count="
				+ count + "]";
	}

}

