package com.personnelSystem.util;

import java.util.Date;

public class ResultDataDto implements java.io.Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -6890381566953365884L;

	/**
	 * 返回的处理结果Code
	 *  0       ： 处理成功
	 *  其他: 处理失败（详细内容看resultMessage）
	 * 
	*/
	private String resultCode;
	
	/**
	 * 返回的处理结果消息
	 * 
	*/
	private String resultMessage;

	/**
	 * 最后访问时间
	 */
	private Date lastModifyDate;
	
	/**
	 * @return the resultCode
	 */
	public String getResultCode() {
		return resultCode;
	}

	/**
	 * @param resultCode the resultCode to set
	 */
	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	/**
	 * @return the resultMessage
	 */
	public String getResultMessage() {
		return resultMessage;
	}

	/**
	 * @param resultMessage the resultMessage to set
	 */
	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}

	/**
	 * @return the lastModifyDate
	 */
	public Date getLastModifyDate() {
		return lastModifyDate;
	}

	/**
	 * @param lastModifyDate the lastModifyDate to set
	 */
	public void setLastModifyDate(Date lastModifyDate) {
		this.lastModifyDate = lastModifyDate;
	}
}
