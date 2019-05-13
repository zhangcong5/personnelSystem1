package com.personnelSystem.util;

import java.io.Serializable;

public class ApiRequest<T> implements Serializable {

	private static final long serialVersionUID = 1L;

	//	/**
	//	 * 登录账号的id
	//	 */
	//	private Integer subjectId;
	//
	//	/**
	//	 * 登录账号所有人姓名
	//	 */
	//	private String subjectName;
	//
	//	/**
	//	 * 登录账号绑定的手机号
	//	 */
	//	private String subjectMobile;
	//
	//	/**
	//	 * 当前登录的用户id(如果是登录到公司则为该公司的id,如果是个人则为个人的id)
	//	 */
	//	private Integer profileId;
	//
	//	/**
	//	 * 是作为企业用户(B)登录还是个人用户(C)登录
	//	 * 
	//	 */
	//	private String usrTypeCd;

	/**
	 * 请求内容
	 */
	private T body;

	/**
	 * 请求发起方的产品代码
	 */
	private String productCode;

	/**
	 * 请求发起方的应用代码
	 */
	private String appCode;

	/**
	 * 签名
	 */
	private String sign;

	/**
	 * 接口版本号
	 */
	private String version;

	public T getBody() {
		return body;
	}

	public void setBody(T body) {
		this.body = body;
	}

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getAppCode() {
		return appCode;
	}

	public void setAppCode(String appCode) {
		this.appCode = appCode;
	}

	public String getSign() {
		return sign;
	}

	public void setSign(String sign) {
		this.sign = sign;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

}

