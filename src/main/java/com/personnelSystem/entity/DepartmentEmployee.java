package com.personnelSystem.entity;

import java.util.Date;

public class DepartmentEmployee extends DepartmentEmployeeKey {
    private Integer createdbyid;

	private Date createdtime;

	private Integer modifybyid;

	private Date modifydatetime;

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

}