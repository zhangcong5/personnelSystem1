package com.personnelSystem.entity;

import java.util.Date;

public class Department {
    private Integer id;

	private String departmentname;

	private String mobile;

	private Integer createdbyid;

	private Date createdtime;

	private Integer modifybyid;

	private Date modifydatetime;

	private Boolean version;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDepartmentname() {
		return departmentname;
	}

	public void setDepartmentname(String departmentname) {
		this.departmentname = departmentname == null ? null : departmentname.trim();
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile == null ? null : mobile.trim();
	}

	public Integer getCreatedbyid() {
		return createdbyid;
	}

	public void setCreatedbyid(Integer createdbyid) {
		this.createdbyid = createdbyid;
	}

	public Date getCreatedtime() {
		return createdtime;
	}

	public void setCreatedtime(Date createdtime) {
		this.createdtime = createdtime;
	}

	public Integer getModifybyid() {
		return modifybyid;
	}

	public void setModifybyid(Integer modifybyid) {
		this.modifybyid = modifybyid;
	}

	public Date getModifydatetime() {
		return modifydatetime;
	}

	public void setModifydatetime(Date modifydatetime) {
		this.modifydatetime = modifydatetime;
	}

	public Boolean getVersion() {
		return version;
	}

	public void setVersion(Boolean version) {
		this.version = version;
	}

}