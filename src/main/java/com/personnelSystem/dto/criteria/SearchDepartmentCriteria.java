package com.personnelSystem.dto.criteria;

import com.personnelSystem.util.Pagination;

public class SearchDepartmentCriteria extends Pagination{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5836935778503866843L;
	
	/**
	 * 部门名称
	 */
	private String departmentName;
	
	/**
	 * 部门Id
	 */
    private Integer Id;

    /**
     * 部门所属公司
     */
    private String mobile;

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer Id) {
		this.Id = Id;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	
}
