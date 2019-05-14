var mytable = null;
	layui.use('table', function(){
		var table = layui.table;
		mytable =  table.render({
			elem: '#announcement-list'
			,url:'/announcement/list.do'
			,cellMinWidth: 100
			,method:'POST'
			,where:searchParams()
			,request: {
				pageName: 'pageNo' //页码的参数名称，默认：page
				,limitName: 'pageSize' //每页数据量的参数名，默认：limit
			}
		    ,cols: [[ //表头
		      {field: 'id', title: 'ID', width:80, sort: true, fixed: 'left'}
		      ,{field: 'title', title: '标题', width:220}
		      ,{field: 'state', title: '状态', width:120,
		    	  templet: function(d){
						if(d==1){
							return "已禁用";
						}else{
							return "已启用";
						}
		    	      }}
		      ,{field: 'createbyid', title: '创建人', width:80} 
		      ,{field: 'createtime', title: '创建时间', width: 200}
		      ,{fixed: 'right', width:180, align:'center',toolbar:'<div><a title=\'编辑\' onclick=\'WeAdminShow()\' href=\'javascript:;\'><i class=\'layui-icon\'>&#xe642;</i></a><a onclick=\'stop()\' href=\'javascript:;\' title=\'启用\'><i class=\'layui-icon\'>&#xe601;</i></a><a onclick=\'del()\' href=\'javascript:;\' title=\'删除\'><i class=\'layui-icon\'>&#xe640;</i></a></div>'}
		    ]]
		});
	});

function searchParams() {
	var params = {};
	params.id = $('#id').val();
    params.title = $('#title').val();
	return params;
}

$("#select-btn").click(function () {
		select();
		/*var params = searchParams();
		var pager = {};
		var pageNo = 1;
		var pageSize = 10;
		params['pager.pageNo'] = pageNo;
		params['pager.pageSize'] = pageSize;*/
	}
)

