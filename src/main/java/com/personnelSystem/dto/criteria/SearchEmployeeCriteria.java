package com.personnelSystem.dto.criteria;

import com.personnelSystem.util.Pagination;

public class SearchEmployeeCriteria extends Pagination{
	
	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 8432701423224267400L;

	/**
	 * 员工id
	 */
	private Integer id;
	
	/**
	 * 员工姓名
	 */
	private String nickname;
	
	/**
	 * 员工邮箱
	 */
	private String email;
	
	/**
	 * 员工手机号
	 */
	private String mobile;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
		
	
}
