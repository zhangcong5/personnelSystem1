	var mytable = null;
	layui.use(['laydate', 'layer', 'table', 'carousel', 'upload', 'element'], function(){
        var laypage = layui.laypage //分页
            ,layer = layui.layer //弹层
            ,table = layui.table //表格
            ,element = layui.element; //元素操作
		mytable =  table.render({
			elem: '#department-list'
			,url:'/department/list.do'
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
			      {field: 'id', title: '编号', width:80, sort: true, fixed: 'left', align:'center'}
			      ,{field: 'departmentname', title: '部门名称', width:100, align:'center'}
			      ,{field: 'mobile', title: '联系方式', width:150, align:'center'}
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
                        url:"/department/delete.do?id="+ data.id + "&" +"modifyDateTime="+ data.modifyDateTime,
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
    params.departmentname = $('#departmentname').val();
    params.mobile = $('#mobile').val();
	return params;
}


