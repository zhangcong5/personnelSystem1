	var mytable = null;
	layui.use(['laydate', 'layer', 'table', 'carousel', 'upload', 'element'], function(){
        var laypage = layui.laypage //分页
            ,layer = layui.layer //弹层
            ,table = layui.table //表格
            ,element = layui.element; //元素操作
		mytable =  table.render({
			elem: '#employee-list'
			,url:'/employee/list.do'
			,cellMinWidth: 100
			,method:'POST'
			,where:searchParams()
			,request: {
				pageName: 'page' //页码的参数名称，默认：page
				,limitName: 'pageSize' //每页数据量的参数名，默认：limit
			}
            //开启分页
            ,page: true
		    ,cols: [[ //表头
			      {field: 'id', title: '员工号', width:80, sort: true, fixed: 'left', align:'center'}
			      ,{field: 'nickname', title: '名称', width:80, align:'center'}
			      ,{field: 'sex', title: '性别', width:60, align:'center',
			    	  templet: function(d){
							if(d==1){
								return "男";
							}else{
								return "女";
							}
			    	      }}
			      ,{field: 'mgr', title: '上级', width:80, align:'center'}
			      ,{field: 'departmentId', title: '部门', width:80, align:'center'}
			      ,{field: 'salary', title: '薪水', width:80, align:'center'}
			      ,{field: 'mobile', title: '手机号', width:150, align:'center'}
			      ,{field: 'email', title: '邮箱', width:200, align:'center'}
			      ,{field: 'hiredate', title: '入职日期', width:150, align:'center'}
			      ,{field: 'terminationDate', title: '离职日期', width:150, align:'center'}
			      ,{field: 'modifyDateTime', title: '最后修改时间', width:150, align:'center'}
		      ,{fixed: 'right', width:150, align:'center',toolbar:'<div><a class=\'layui-btn layui-btn-xs\' lay-event=\'detail\'>查看</a><a class=\'layui-btn layui-btn-xs\' lay-event=\'edit\'>编辑</a><a class=\'layui-btn layui-btn-danger layui-btn-xs\' lay-event=\'del\'>删除</a></div>'}
		    ]]
		});
        //监听工具条
        table.on('tool(test)', function(obj){ //注：tool是工具条事件名，test是table原始容器的属性 lay-filter="对应的值"
            var data = obj.data //获得当前行数据
                ,layEvent = obj.event; //获得 lay-event 对应的值

            if(layEvent === 'detail'){
            	layer.msg('ID：'+ data.id + ' 的查看操作');
            } else if(layEvent === 'del'){
                layer.confirm('真的删除行么', function(index){

                    obj.del(); //删除对应行（tr）的DOM结构
                    layer.close(index);
                    //向服务端发送删除指令
                    $.ajax({
                        url:"/employee/delete.do?id="+ data.id + "&" +"modifyDateTime="+ data.modifyDateTime,
                        type: "POST",
                        data:id,
                        success: function(result){
    						layer.close(index);
    						if (result.success==true)
    						{
    							layer.alert('删除成功');
    						}else{
    							layer.alert('删除失败，'+result.msg, {icon:5,title:"出错提示"});
    						}
    					},
                    })                    
                });
                
            } else if(layEvent === 'edit'){
            	layer.alert('编辑行：<br>'+ JSON.stringify(data))
            }
        });
	});

	
function searchParams() {
	var params = {};
    params.nickname = $('#nickname').val();
	return params;
}


