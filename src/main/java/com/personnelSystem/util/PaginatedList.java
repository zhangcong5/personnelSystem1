package com.personnelSystem.util;

import java.io.Serializable;
import java.util.List;

public class PaginatedList<T> implements Serializable {

	private static final long serialVersionUID = -2582060677791599460L;

	/**
	 * 分页结果集
	 */
	private List<T> rows;

	/**
	 * 分页信息
	 */
	private Pagination pagination;

	/**
	 * @return the rows
	 */
	public List<T> getRows() {
		return rows;
	}

	/**
	 * @param rows
	 *            the rows to set
	 */
	public void setRows(List<T> rows) {
		this.rows = rows;
	}

	/**
	 * @return the pagination
	 */
	public Pagination getPagination() {
		return pagination;
	}

	/**
	 * @param pagination
	 *            the pagination to set
	 */
	public void setPagination(Pagination pagination) {
		this.pagination = pagination;
	}

	@Override
	public String toString() {
		return "PaginatedList{" +
				"rows=" + rows +
				", pagination=" + pagination +
				'}';
	}
}

