var mytable = null;
var title = '';
	layui.use(['laydate', 'layer', 'table', 'carousel', 'upload', 'element'], function(){
        var table = layui.table //表格
			,$ = layui.jquery
		mytable =  table.render({
			elem: '#announcement-list'
			,url:'/announcement/list.do'
			,cellMinWidth: 100
			,method:'POST'
            ,request: {
				pageName: 'page' //页码的参数名称，默认：page
				,limitName: 'pageSize'//每页数据量的参数名，默认：limit
			}
            //开启分页
            ,page: true
            ,id: 'testReload'
		    ,cols: [[ //表头
		      {field: 'id', title: '序号', width:80, sort: true, fixed: 'left'}
		      ,{field: 'title', title: '标题', width:220}
		      ,{field: 'content', title: '内容', width:400}
		      ,{field: 'state', title: '状态', width:120,
		    	  templet: function(d){
						if(d==1){
							return "已禁用";
						}else{
							return "已启用";
						}
		    	      }}
		      ,{field: 'createbyName', title: '创建人', width:80}
		      ,{field: 'modifybyName', title: '修改人', width:80}
		      ,{field: 'createtime', title: '创建时间', width: 200}
		      ,{fixed: 'right', title: '操作区',width:120, align:'center',toolbar:'<div><a title=\'编辑\' onclick=\'WeAdminShow()\' href=\'javascript:;\'><i class=\'layui-icon\'>&#xe642;</i></a><a onclick=\'stop()\' href=\'javascript:;\' title=\'启用\'><i class=\'layui-icon\'>&#xe601;</i></a><a onclick=\'del()\' href=\'javascript:;\' title=\'删除\'><i class=\'layui-icon\'>&#xe640;</i></a></div>'}
		    ]]
		});
    });



