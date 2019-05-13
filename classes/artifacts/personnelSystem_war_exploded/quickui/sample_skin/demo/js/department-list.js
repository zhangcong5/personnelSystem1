//数据表格使用
$(function() {
	grid = $("#dataBasic").quiGrid({
		url:"/department/list.do",
		method:"POST",
		contentType:"application/x-www-form-urlencoded;charset=utf-8",
		params:initComplete(),
		columns:[
			{display: '编号', name:'id', align:'center', width:200, frozen:true},
			{display: '名称', name:'departmentname', align:'center', width:400},
			{display: '联系方式', name:'mobile', align:'center', width:400},
			{
				display: '操作',
				name: 'name',
				align: 'left',
				width: 300,
				render: function(rowdata, rowindex, value, column) {
					var mainCon = $('<div></div>');
					var con = $('<span class="operation_look" onclick="details(' + rowdata.id +')" style="float:none;">编辑</span><span class="operation_picking" onclick="deleteDepartment('+ rowdata.id +",'"+rowdata.modifyDateTime + "'"+')">删除</span>');
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
	params.departmentName= $('#departmentname').val();
	params.mobile= $('#mobile').val();
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
	window.location='department-detail.html?id='+id;
}

function deleteDepartment(id,modifyDateTime) {
    $.ajax({
        url:"/department/delete.do?id="+ id + "&" +"modifyDateTime="+ modifyDateTime,
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

