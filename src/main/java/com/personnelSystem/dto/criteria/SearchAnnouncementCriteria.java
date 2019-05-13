package com.personnelSystem.dto.criteria;

import com.personnelSystem.util.Pagination;

public class SearchAnnouncementCriteria extends Pagination{

	/**
	 * 
	 */
	private static final long serialVersionUID = 911247542231606971L;
	
	private Integer id;
	
	private String title;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String gettitle() {
		return title;
	}

	public void settitle(String title) {
		this.title = title;
	}
	

}
