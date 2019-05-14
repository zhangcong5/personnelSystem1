package com.personnelSystem.dto.admin;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

public class EmployeeInfoDto {
		/**
		 * 员工ID
		 */
		private Integer id;
		/**
		 * 员工姓名
		 */
		private String nickname;
		/**
		 * 员工领导编号
		 */
		private Integer mgr;
		/**
		 * 员工性别
		 */
		private int sex;
		/**
		 * 员工薪水
		 */
		private Integer salary;
		/**
		 * 手机号
		 */
		private String mobile;
		/**
		 * 员工邮箱
		 */
		private String email;

		/**
		 * 入职时间
		 */
		@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
		@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
		private Date hiredate;
		
		/**
		 * 离职时间
		 */
		@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
		@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
		private Date terminationDate;
		
		/**
		 * 创建时间
		 */
		@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
		@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
		private Date createdTime;
		 
		/**
		 *创建人ID 
		 */
		private Integer createdById;
		 
		/**
		 * 修改人ID
		 */
		private Integer modifyById;
		 
		/**
		 * 修改时间
		 */
		@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
		@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
		private Date modifyDateTime;
		 
		/**
		 *部门编号
		 */
		private Integer departmentId;
		
		/**
		 *标识 
		 */
	    private Boolean version;
	    
	    /**
	     * 是否为管理员0：不是，1：是
	     */
		private Integer isadmin;
	
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
		public int getSex() {
			return sex;
		}
		public void setSex(int sex) {
			this.sex = sex;
		}
		public Integer getSalary() {
			return salary;
		}
		public void setSalary(Integer salary) {
			this.salary = salary;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
	
		public Date getCreatedTime() {
			return createdTime;
		}
		
		public void setCreatedTime(Date createdTime) {
			this.createdTime = createdTime;
		}
		
		public Integer getCreatedById() {
			return createdById;
		}
		
		public void setCreatedById(Integer createdById) {
			this.createdById = createdById;
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
		
		public Integer getDepartmentId() {
			return departmentId;
		}
		public void setDepartmentId(Integer departmentId) {
			this.departmentId = departmentId;
		}
		
		public Integer getMgr() {
			return mgr;
		}
		public void setMgr(Integer mgr) {
			this.mgr = mgr;
		}
		public String getMobile() {
			return mobile;
		}
		public void setMobile(String mobile) {
			this.mobile = mobile;
		}
		public Date getHiredate() {
			return hiredate;
		}
		public void setHiredate(Date hiredate) {
			this.hiredate = hiredate;
		}
		public Date getTerminationDate() {
			return terminationDate;
		}
		public void setTerminationDate(Date terminationDate) {
			this.terminationDate = terminationDate;
		}
		
		public Boolean getVersion() {
			return version;
		}
		public void setVersion(Boolean version) {
			this.version = version;
		}
		
		
		public Integer getIsadmin() {
			return isadmin;
		}
		public void setIsadmin(Integer isadmin) {
			this.isadmin = isadmin;
		}
		public EmployeeInfoDto(Integer id, String nickname, Integer mgr, int sex, Integer salary, String mobile,
				String email, Date hiredate, Date terminationDate, Date createdTime, Integer createdById,
				Integer modifyById, Date modifyDateTime, Integer departmentId, Boolean version, Integer isadmin) {
			super();
			this.id = id;
			this.nickname = nickname;
			this.mgr = mgr;
			this.sex = sex;
			this.salary = salary;
			this.mobile = mobile;
			this.email = email;
			this.hiredate = hiredate;
			this.terminationDate = terminationDate;
			this.createdTime = createdTime;
			this.createdById = createdById;
			this.modifyById = modifyById;
			this.modifyDateTime = modifyDateTime;
			this.departmentId = departmentId;
			this.version = version;
			this.isadmin = isadmin;
		}
		
		@Override
		public String toString() {
			return "EmployeeInfoDto [id=" + id + ", nickname=" + nickname + ", mgr=" + mgr + ", sex=" + sex
					+ ", salary=" + salary + ", mobile=" + mobile + ", email=" + email + ", hiredate=" + hiredate
					+ ", terminationDate=" + terminationDate + ", createdTime=" + createdTime + ", createdById="
					+ createdById + ", modifyById=" + modifyById + ", modifyDateTime=" + modifyDateTime
					+ ", departmentId=" + departmentId + ", version=" + version + ", isadmin=" + isadmin + "]";
		}
	 
		public EmployeeInfoDto() {}
		
}
