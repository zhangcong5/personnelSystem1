package com.personnelSystem.dto.admin;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

public class DepartmentInfoDto {
	
	/**
	 * 部门id
	 */
    private Integer Id;
    /**
     * 部门名称
     */
    private String departmentname;
    /**
     * 部门联系方式
     */
    private String mobile;
    /**
     * 创建人id
     */
    private Integer createdById;
    /**
     * 创建时间
     */
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createdTime;
    /**
     * 修改人id
     */
    private Integer modifyById;
    /**
     * 修改时间
     */
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date modifyDateTime;
    /**
     * 标识
     */
    private Boolean version;
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public String getDepartmentname() {
		return departmentname;
	}
	public void setDepartmentname(String departmentname) {
		this.departmentname = departmentname;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public Integer getCreatedById() {
		return createdById;
	}
	public void setCreatedById(Integer createdById) {
		this.createdById = createdById;
	}
	public Date getCreatedTime() {
		return createdTime;
	}
	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}
	public Integer getModifyById() {
		return modifyById;
	}
	public void setModifyById(Integer modifyById) {
		this.modifyById = modifyById;
	}
	public Date getModifyDateTime() {
		return modifyDateTime;
	}
	public void setModifyDateTime(Date modifyDateTime) {
		this.modifyDateTime = modifyDateTime;
	}
	public Boolean getVersion() {
		return version;
	}
	public void setVersion(Boolean version) {
		this.version = version;
	}
	
	public DepartmentInfoDto() {}
	
	public DepartmentInfoDto(Integer id, String departmentname, String mobile, Integer createdById, Date createdTime,
			Integer modifyById, Date modifyDateTime, Boolean version) {
		super();
		Id = id;
		this.departmentname = departmentname;
		this.mobile = mobile;
		this.createdById = createdById;
		this.createdTime = createdTime;
		this.modifyById = modifyById;
		this.modifyDateTime = modifyDateTime;
		this.version = version;
	}
	
	@Override
	public String toString() {
		return "DepartmentInfoDto [Id=" + Id + ", departmentname=" + departmentname + ", mobile=" + mobile
				+ ", createdById=" + createdById + ", createdTime=" + createdTime + ", modifyById=" + modifyById
				+ ", modifyDateTime=" + modifyDateTime + ", version=" + version + "]";
	}

	
    
    
}
