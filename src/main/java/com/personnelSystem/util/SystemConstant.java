package com.personnelSystem.util;

public class SystemConstant {
	/**
	 * 处理成功
	 */
	public static final String Respose_Code_200 = "200";

	/**
	 * 处理时出错
	 */
	public static final String Respose_Code_500 = "500";	
	
    public final static String Code_OK = "0";
    
    
    public final static String Code_DBData_Update_Fail			= "0000001";
    public final static String Code_GetEmployee_DbErr				= "1000009";
    public final static String Code_GetDepartment_DbErr			= "1000010";
    public final static String Code_Employee_Insert_Err			= "1000011";
    public final static String Code_Employee_Update_Err			= "1000012";
    public final static String Code_Employee_Delete_Err			= "1000013";
    public final static String Code_GetEmployeeID_NotExisted	= "1000014";
    public final static String Code_Department_Insert_Err		= "1000015";
    public final static String Code_Department_Update_Err		= "1000016";
    public final static String Code_Department_Delete_Err		= "1000017";
    public final static String Code_GetDepartmentID_NotExisted	= "1000018";
    public final static String Code_Aattendance_Insert_Err		= "1000019";
    public final static String Code_Aattendance_Update_Err		= "1000020";
    public final static String Code_Aattendance_Delete_Err		= "1000021";
    public final static String Code_GetAattendanceID_NotExisted	= "1000022";
    public final static String Code_Announcement_Insert_Err		= "1000023";
    public final static String Code_Announcement_Update_Err		= "1000024";
    public final static String Code_Announcement_Delete_Err		= "1000025";
    public final static String Code_GetAnnouncementID_NotExisted	= "1000026";
    public final static String Code_GetAnnouncement_DbErr			= "1000027";
    
    
    public final static String Msg_Request_Null = "API接口的请求对象为NULL。";
    public final static String Msg_DBData_Update_Fail = "操作失败。\r\n 没有需要更新或者删除的数据，请确保数据的实时性。";
    public final static String Msg_GetEmployee_DbErr = "从数据库中取得员工信息发生异常 。 \r\n【%s】\r\n";
    public final static String Msg_GetDepartment_DbErr = "从数据库中取得部门信息发生异常 。 \r\n【%s】\r\n";
    public final static String Msg_GetAnnouncement_DbErr = "从数据库中取得部门信息发生异常 。 \r\n【%s】\r\n";
    public final static String Msg_Employee_Insert_OK = "员工新增成功 【员工ID：%s】【员工名：%s】\r\n";
    public final static String Msg_Employee_Insert_Err = "员工新增失败 【员工ID：%s】。\r\n【错误信息：%s】\r\n";
    public final static String Msg_Employee_Update_OK = "员工编辑成功  【员工ID：%s】【员工名：%s】\r\n";
    public final static String Msg_Employee_Update_Err = "员工编辑失败 【员工ID：%s】\r\n【错误信息：%s】\r\n";
    public final static String Msg_Employee_Delete_OK = "员工删除成功 【员工ID：%s】【员工名：%s】\r\n";
    public final static String Msg_Employee_Delete_Err = "员工删除失败 【员工ID：%s】\r\n【错误信息：%s】\r\n";
    public final static String Msg_GetEmployeeID_NotExisted = "该数据已不存在，请刷新后再操作【员工ID： %s】。\r\n";
    public final static String Msg_Department_Insert_OK = "部门新增成功 【部门ID：%s】【部门名：%s】\r\n";
    public final static String Msg_Department_Insert_Err = "部门新增失败 【部门ID：%s】。\r\n【错误信息：%s】\r\n";
    public final static String Msg_Department_Update_OK = "部门编辑成功  【部门ID：%s】【部门名：%s】\r\n";
    public final static String Msg_Department_Update_Err = "部门编辑失败 【部门ID：%s】\r\n【错误信息：%s】\r\n";
    public final static String Msg_Department_Delete_OK = "部门删除成功 【部门ID：%s】【部门名：%s】\r\n";
    public final static String Msg_Department_Delete_Err = "部门删除失败 【部门ID：%s】\r\n【错误信息：%s】\r\n";
    public final static String Msg_GetDepartmentID_NotExisted = "该数据已不存在，请刷新后再操作【部门ID： %s】。\r\n";
    
    public final static String Msg_Announcement_Insert_OK = "公告新增成功 【公告ID：%s】【公告名：%s】\r\n";
    public final static String Msg_Announcement_Insert_Err = "公告新增失败 【公告ID：%s】。\r\n【错误信息：%s】\r\n";
    public final static String Msg_Announcement_Update_OK = "公告编辑成功  【公告ID：%s】【公告名：%s】\r\n";
    public final static String Msg_Announcement_Update_Err = "公告编辑失败 【公告ID：%s】\r\n【错误信息：%s】\r\n";
    public final static String Msg_Announcement_Delete_OK = "公告删除成功 【公告ID：%s】【公告名：%s】\r\n";
    public final static String Msg_Announcement_Delete_Err = "公告删除失败 【公告ID：%s】\r\n【错误信息：%s】\r\n";
    public final static String Msg_GetAnnouncementID_NotExisted = "该数据已不存在，请刷新后再操作【公告ID： %s】。\r\n";
    
    public final static String Msg_Aattendance_Insert_OK = "考勤新增成功 【考勤ID：%s】【员工名：%s】\r\n";
    public final static String Msg_Aattendance_Insert_Err = "考勤新增失败 【考勤ID：%s】。\r\n【错误信息：%s】\r\n";
    public final static String Msg_Aattendance_Update_OK = "考勤编辑成功  【考勤ID：%s】【员工名：%s】\r\n";
    public final static String Msg_Aattendance_Update_Err = "考勤编辑失败 【考勤ID：%s】\r\n【错误信息：%s】\r\n";
    public final static String Msg_GetAattendanceID_NotExisted = "该数据已不存在，请刷新后再操作【考勤ID： %s】。\r\n";
    
    /**
     * 查询成功
     */
    public static final String Select_Success = "查询成功";
    
    /**
     * 新增成功
     */
    public static final String Insert_Success = "新增成功";
    
    /**
     * 新增失败
     */
    public static final String Insert_Fail = "新增失败";
    
    /**
     * 更新失败
     */
    public static final String Update_Fail = "更新失败";
    
    /**
     * 更新失败
     */
    public static final String Update_Success = "更新成功";
    
    /**
     * 删除失败
     */
    public static final String Delete_Fail = "删除失败";
    
    /**
     * 删除成功
     */
    public static final String Delete_Success = "删除成功";

}
