var grid = null;
//数据表格使用
$(function() {
	grid = $("#dataBasic").quiGrid({
		url:"/employee/list.do",
		method:"POST",
		contentType:"application/x-www-form-urlencoded;charset=utf-8",
		params:initComplete(),
		columns:[
			{display: '员工号', name:'id', align:'center', width:200, frozen:true},
			{display: '名称', name:'nickname', align:'center', width:200},
			{display: '上级', name:'mgr', align:'center', width:200},
			{display: '手机号', name:'mobile', align:'center', width:200},
			{display: '邮箱', name:'email', align:'center', width:200},
			{display: '部门', name:'departmentId', align:'center', width:200},
		],
		pageSize:10,
		rownumbers:false,
		checkbox:false,
		height:'100%',
		width:'100%',
		dataAction:"server"
	});
});

function initComplete() {
	var params = {};
	params.id = $('#id').val();
	params.nickname= $('#nickname').val();
	params.mobile = $('#mobile').val();
	params.email = $('#email').val();
	return params;
}


$("#select-btn").click(function() {
	var params = initComplete();
	var pager = {};
	var pageNo = 1;
	var pageSize = 10;
	pager.pageNo = pageNo;
	pager.pageSize = pageSize;
	params.pager = pager;
	grid.loadServerData(params);
})
