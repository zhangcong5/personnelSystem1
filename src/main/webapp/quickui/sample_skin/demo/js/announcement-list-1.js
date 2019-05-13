//数据表格使用
$(function() {
	grid = $("#dataBasic").quiGrid({
		url:"/announcement/list.do",
		method:"POST",
		contentType:"application/x-www-form-urlencoded;charset=utf-8",
		params:initComplete(),
		columns:[
			{display: '公告号', name:'id', align:'center', width:"10%"},
			{display: '标题', name:'title', align:'center', width:"40%", frozen:true},
			{display: '状态', name:'state', align:'center', width:"15",
				render: function (rowdata, rowindex, value, column){
					if(value==1){
						return "禁用";
					}else{
						return "启用";
					}
				}
			},
			{display: '创建人', name:'createbyid', align:'center', width:"15%"},
			{display: '创建时间', name:'createtime', align:'center', width:"20"},
			{
				display: '操作',
				name: 'name',
				align: 'center',
				width: 170,
				render: function(rowdata, rowindex, value, column) {
					var mainCon = $('<div></div>');
					var con = $('<span class="operation_look" onclick="details()">查看</span><div class="popupMenu popupMenu2"><div class="popupMenu_link"><a href="javascript:;" class="themeBgColor">操作</a></div><div class="popupMenu_con white_con"><a href="javascript:;" onclick=""><span>编辑</span></a><a href="javascript:;" onclick=""><span>停用</span></a><a href="javascript:;" onclick=""><span>删除</span></a></div></div>');
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
	params.title= $('#title').val();
	params.state = $('#state').val();
	params.createbyid = $('#createbyid').val();
	params.createtime = $('#createtimes').val();
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
	window.location='announcement-detail.html?id='+id;
}

function deleteAnnouncement(id,modifyDateTime) {
    $.ajax({
        url:"/announcement/delete.do?id="+ id + "&" +"modifyDateTime="+ modifyDateTime,
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



