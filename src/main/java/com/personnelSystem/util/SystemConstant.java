package com.personnelSystem.util;

public class SystemConstant {
	/**
	 * 处理成功
	 */
	public static final String Respose_Code_200 = "0";

	/**
	 * 处理时出错
	 */
	public static final String Respose_Code_500 = "500";	
	
    public final static String Code_OK = "0";
    
    
    public final static String Code_DBData_Update_Fail			= "0000001";
    public final static String Code_GetEmployee_DbErr			= "1000009";
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
    public final static String Code_GetRoleID_NotExisted		= "1000028";
    public final static String Code_Role_Delete_Err				= "1000029";
    public final static String Code_Role_Detail_Err				= "1000030";
    public final static String Code_Role_Insert_Err				= "1000031";
    public final static String Code_Role_Update_Err				= "1000032";
    public final static String Code_RoleResource_Update_Err		= "1000033";
    public final static String Code_Resource_Detail_Err			= "1000034";
    public final static String Code_Resource_Insert_Err			= "1000035";
    public final static String Code_Resource_Update_Err			= "1000036";
    public final static String Code_Resource_Valid_Err			= "1000037";
    public final static String Code_GetResourceID_NotExisted	= "1000038";
    public final static String Code_Resource_Delete_Err			= "1000039";
    public final static String Code_Subject_AllocateRsrcs_Err	= "1000033";
    public final static String Code_Subject_AllocateRoles_Err	= "1000033";
    public final static String Code_Subject_GetRoles_Err	= "1000033";
    public final static String Code_Subject_GetResourcs_Err	= "1000033";
    public final static String Code_Subject_Detail_Err			= "1000034";
    public final static String Code_Subject_Insert_Err			= "1000035";
    public final static String Code_Subject_Update_Err			= "1000036";
    public final static String Code_GetSubjectID_NotExisted	= "1000038";
    public final static String Code_Subject_Delete_Err			= "1000039";
    public final static String Code_Resource_GetList_Err			= "1000040";
    
    
    public final static String Msg_Request_Null = "API接口的请求对象为NULL。";
    public final static String Msg_DBData_Update_Fail = "操作失败。\r\n 没有需要更新或者删除的数据，请确保数据的实时性。";
    public final static String Msg_LastModifyDate_Error         = "更新失败，请确保数据的实时性。/r/n【LastModifyDate:%s】/r/n";
    public final static String Msg_GetEmployee_DbErr = "从数据库中取得员工信息发生异常 。 \r\n【%s】\r\n";
    public final static String Msg_GetDepartment_DbErr = "从数据库中取得部门信息发生异常 。 \r\n【%s】\r\n";
    public final static String Msg_GetAnnouncement_DbErr = "从数据库中取得公告信息发生异常 。 \r\n【%s】\r\n";
    public final static String Msg_GetRole_DbErr = "从数据库中取得角色信息发生异常 。 \r\n【%s】\r\n";
    public final static String Msg_GetResource_DbErr = "从数据库中取得资源信息发生异常 。 \r\n【%s】\r\n";
    public final static String Msg_GetSubject_DbErr = "从数据库中取得资源信息发生异常 。 \r\n【%s】\r\n";
    
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
    
    public final static String Msg_Role_Insert_OK = "角色新增成功 【角色ID：%s】【角色名：%s】\r\n";
    public final static String Msg_Role_Insert_Err = "角色新增失败 【角色ID：%s】。\r\n【错误信息：%s】\r\n";
    public final static String Msg_Role_Update_OK = "角色编辑成功  【角色ID：%s】【角色名：%s】\r\n";
    public final static String Msg_Role_Update_Err = "角色编辑失败 【角色ID：%s】\r\n【错误信息：%s】\r\n";
    public final static String Msg_RoleResource_Update_OK = "角色资源编辑成功  【角色ID：%s】【角色名：%s】\r\n";
    public final static String Msg_RoleResource_Update_Err = "角色资源编辑失败 【角色ID：%s】\r\n【错误信息：%s】\r\n";
    public final static String Msg_Role_Delete_OK = "角色删除成功 【角色ID：%s】【角色名：%s】\r\n";
    public final static String Msg_Role_Delete_Err = "角色删除失败 【角色ID：%s】\r\n【错误信息：%s】\r\n";
    public final static String Msg_GetRoleID_NotExisted = "该数据已不存在，请刷新后再操作【角色ID： %s】。\r\n";
    
    public final static String Msg_Resource_Insert_OK = "资源新增成功 【资源ID：%s】【资源名：%s】\r\n";
    public final static String Msg_Resource_Insert_Err = "资源新增失败 【资源ID：%s】。\r\n【错误信息：%s】\r\n";
    public final static String Msg_Resource_Update_OK = "资源编辑成功  【资源ID：%s】【资源名：%s】\r\n";
    public final static String Msg_Resource_Update_Err = "资源编辑失败 【资源ID：%s】\r\n【错误信息：%s】\r\n";
    public final static String Msg_Resource_Valid_OK = "资源开启成功  【资源ID：%s】【资源名：%s】\r\n";
    public final static String Msg_Resource_Valid_Err = "资源开启编辑失败 【资源ID：%s】\r\n【错误信息：%s】\r\n";
    public final static String Msg_Resource_InValid_OK = "资源关闭成功  【资源ID：%s】【资源名：%s】\r\n";
    public final static String Msg_Resource_InValid_Err = "资源关闭编辑失败 【资源ID：%s】\r\n【错误信息：%s】\r\n";
    public final static String Msg_Resource_Delete_OK = "资源删除成功 【资源ID：%s】【资源名：%s】\r\n";
    public final static String Msg_Resource_Delete_Err = "资源删除失败 【资源ID：%s】\r\n【错误信息：%s】\r\n";
    public final static String Msg_Resource_GetList_Err = "资源列表获取失败 【资源ID：%s】\r\n【错误信息：%s】\r\n";
    public final static String Msg_GetResourceID_NotExisted = "该数据已不存在，请刷新后再操作【资源ID： %s】。\r\n";
    
    public final static String Msg_Subject_Insert_OK = "用户新增成功 【用户ID：%s】【用户名：%s】\r\n";
    public final static String Msg_Subject_Insert_Err = "用户新增失败 【用户ID：%s】。\r\n【错误信息：%s】\r\n";
    public final static String Msg_Subject_Update_OK = "用户编辑成功  【用户ID：%s】【用户名：%s】\r\n";
    public final static String Msg_Subject_Update_Err = "用户编辑失败 【用户ID：%s】\r\n【错误信息：%s】\r\n";
    public final static String Msg_Subject_AllocateRsrcs_OK = "用户所有资源编辑成功  【用户ID：%s】【用户名：%s】\r\n";
    public final static String Msg_Subject_AllocateRsrcs_Err = "用户所有资源编辑失败 【用户ID：%s】\r\n【错误信息：%s】\r\n";
    public final static String Msg_Subject_AllocateRoles_OK = "用户所有角色编辑成功  【用户ID：%s】【用户名：%s】\r\n";
    public final static String Msg_Subject_AllocateRoles_Err = "用户所有角色编辑失败 【用户ID：%s】\r\n【错误信息：%s】\r\n";
    public final static String Msg_Subject_GetRoles_OK = "用户获取角色编辑成功  【用户ID：%s】【用户名：%s】\r\n";
    public final static String Msg_Subject_GetRoles_Err = "用户获取角色编辑失败 【用户ID：%s】\r\n【错误信息：%s】\r\n";
    public final static String Msg_Subject_GetResourcs_OK = "用户获取资源编辑成功  【用户ID：%s】【用户名：%s】\r\n";
    public final static String Msg_Subject_GetResourcs_Err = "用户获取资源编辑失败 【用户ID：%s】\r\n【错误信息：%s】\r\n";
    public final static String Msg_Subject_Delete_OK = "用户删除成功 【用户ID：%s】【用户名：%s】\r\n";
    public final static String Msg_Subject_Delete_Err = "用户删除失败 【用户ID：%s】\r\n【错误信息：%s】\r\n";
    public final static String Msg_GetSubjectID_NotExisted = "该数据已不存在，请刷新后再操作【用户ID： %s】。\r\n";
    
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
    
    /**
     * 删除失败
     */
    public static final String Allocation_Fail = "分配失败";
    
    /**
     * 删除成功
     */
    public static final String Allocation_Success = "分配成功";
    
	public static final String Msg_Import_UserName = "系统自动导入";
	
	public static final String Msg_Import_Resource_Err = "系统自动导入错误，资源名：%s 资源值：%s";
	
	public final static String User_HaveNot_Resource            = "该用户没有权限，请联系管理员";

}
