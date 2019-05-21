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
						if(d.state==1){
							return "已禁用";
						}else{
							return "已启用";
						}
		    	      }}
		      ,{field: 'createbyName', title: '创建人', width:80}
		      ,{field: 'modifybyName', title: '修改人', width:80}
		      ,{field: 'createtime', title: '创建时间', width: 200}
		      ,{fixed: 'right', title: '操作',width:120, align:'center',toolbar:
                '<div>' +
                // '<a class=\'layui-btn layui-btn-xs\' lay-event=\'update\'>查看</a>' +
                '<a class=\'layui-btn layui-btn-xs\' lay-event=\'edit\'>编辑</a>' +
                '<a class=\'layui-btn layui-btn-danger layui-btn-xs\' lay-event=\'delete\'>停用</a>' +
                '</div>'}
		    ]]
		});
	
        //监听工具条
        table.on('tool(test)', function(obj){ //注：tool是工具条事件名，test是table原始容器的属性 lay-filter="对应的值"
            var data = obj.data //获得当前行数据
                ,layEvent = obj.event; //获得 lay-event 对应的值
            if(layEvent === 'detail'){
            	layer.msg('ID：'+ data.id + ' 的查看操作');
            }
            var dat = {
                id:data.id,
                state:1,
            }
            if(layEvent === 'delete'){
                console.log("删除调用")
                layer.confirm('真的停用行么', function(index){

                    obj.del(); //删除对应行（tr）的DOM结构
                    layer.close(index);
                    //向服务端发送删除指令
                    $.ajax({
                        url:"/announcement/update.do",
                        type: "POST",
                        data:dat,
                        success: function(result){
    						layer.close(index);
    						if (result.success==true)
    						{
                                layer.msg("停用成功!", {time: 1000});
                                layui.table.reload('testReload', {});
    						}else{
                                layer.msg("停用成功!", {time: 1000});
    						}
    					},
                    })                    
                });
                
            }
            if(layEvent === 'edit'){
                window.WeAdminEdit("编辑","./edit.html",data,600,400)
            }
        });
    });

    window.onload = function() {
        $("#search").on("click", function () {
            var title = document.getElementById("title").value;
            layui.use(['laydate', 'layer', 'table', 'carousel', 'upload', 'element'], function () {
                var laypage = layui.laypage //分页
                    , layer = layui.layer //弹层
                    , table = layui.table //表格
                    , $ = layui.jquery
                    , element = layui.element; //元素操作
                mytable = table.render({
                    elem: '#announcement-list'
                    , url: '/announcement/list.do'
                    , cellMinWidth: 100
                    , method: 'POST'
                    , where: {title: title}
                    , request: {
                        pageName: 'page' //页码的参数名称，默认：page
                        , limitName: 'pageSize'//每页数据量的参数名，默认：limit
                    }
                    //开启分页
                    , page: true
                    ,id: 'testReload'
                    , cols: [[ //表头
                        {field: 'id', title: '序号', width: 80, sort: true, fixed: 'left'}
                        , {field: 'title', title: '标题', width: 220}
                        , {field: 'content', title: '内容', width: 400}
                        , {
                            field: 'state', title: '状态', width: 120,
                            templet: function (d) {
                                if (d == 1) {
                                    return "已禁用";
                                } else {
                                    return "已启用";
                                }
                            }
                        }
                        , {field: 'createbyName', title: '创建人', width: 80}
                        , {field: 'modifybyName', title: '修改人', width: 80}
                        , {field: 'createtime', title: '创建时间', width: 200}
                        , {fixed: 'right', title: '操作',width:150, align:'center',toolbar:'<div><a class=\'layui-btn layui-btn-xs\' lay-event=\'detail\'>查看</a><a class=\'layui-btn layui-btn-xs\' lay-event=\'edit\'>编辑</a><a class=\'layui-btn layui-btn-danger layui-btn-xs\' lay-event=\'stop\'>停用</a></div>'}
                    ]]
                });
            });
        });
    }