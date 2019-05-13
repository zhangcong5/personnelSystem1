package com.personnelSystem.dto.criteria;

import com.personnelSystem.util.Pagination;

public class SearchAattendanceCriteria extends Pagination{

	/**
	 * 
	 */
	private static final long serialVersionUID = 911247542231606971L;
	
	private String content;

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

}
