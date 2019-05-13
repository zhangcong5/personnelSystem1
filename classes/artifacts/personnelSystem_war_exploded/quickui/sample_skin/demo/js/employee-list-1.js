//数据表格使用
$(function() {
	grid = $("#dataBasic").quiGrid({
		url:"/employee/list.do",
		method:"POST",
		contentType:"application/x-www-form-urlencoded;charset=utf-8",
		params:initComplete(),
		columns:[
			{display: '员工号', name:'id', align:'center', width:50},
			{display: '名称', name:'nickname', align:'center', width:100, frozen:true},
			{display: '上级', name:'mgr', align:'center', width:100},
			{display: '性别', name:'sex', align:'center', width:50,
				render: function (rowdata, rowindex, value, column){
					if(value==1){
						return "男";
					}else{
						return "女";
					}
				}
			},
			{display: '薪水', name:'salary', align:'center', width:100},
			{display: '手机号', name:'mobile', align:'center', width:150},
			{display: '邮箱', name:'email', align:'center', width:200},
			{display: '部门', name:'departmentId', align:'center', width:50},
			{display: '入职时间', name:'hiredate', align:'center', width:200},
			{display: '离职时间', name:'terminationDate', align:'center', width:200},
			{display: '最后修改时间', name:'modifyDateTime', align:'center', width:200},
			{
				display: '操作',
				name: 'name',
				align: 'left',
				width: 300,
				render: function(rowdata, rowindex, value, column) {
					var mainCon = $('<div></div>');
					var con = $('<span class="operation_look" onclick="details(' + rowdata.id +')" style="float:none;">编辑</span><span class="operation_out_warehouse" onclick="">封禁权限</span><span class="operation_picking" onclick="deleteEmployee('+ rowdata.id +",'"+rowdata.modifyDateTime + "'"+')">删除</span>');
					mainCon.append(con);
					return mainCon.html();
				}
			}
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
});

function notice(message,type){
    top.Notice('showNotice',{
        title:"信息提示",
        text:message,
        type:type
});
}

function details(id){
	window.location='employee-detail.html?id='+id;
}

function deleteEmployee(id,modifyDateTime) {
    $.ajax({
        url:"/employee/delete.do?id="+ id + "&" +"modifyDateTime="+ modifyDateTime,
        type: "POST",
        data:id,
        success:function(res){
			if(res.success){
				notice(res.message,'success');
				quiGrid.loadServerData();
			}else{
				notice(res.message,"error")
			}
        }
    })
}



