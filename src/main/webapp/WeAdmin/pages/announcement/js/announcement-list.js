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
		    ,cols: [[ //表头
		      {field: 'id', title: '序号', width:80, sort: true, fixed: 'left'}
		      ,{field: 'title', title: '标题', width:220}
		      ,{field: 'content', title: '内容', width:400}
		      ,{field: 'state', title: '状态', width:120,
		    	  templet: function(d){
						if(d.state == 1){
							return "已禁用";
						}else{
							return "已启用";
						}
		    	      }}
		      ,{field: 'createbyName', title: '创建人', width:80}
		      ,{field: 'modifybyName', title: '修改人', width:80}
		      ,{field: 'modifydatetime', title: '修改时间', width: 200}
		      ,{fixed: 'right', title: '操作',width:200, align:'center',toolbar:'<div><a class=\'layui-btn layui-btn-xs\' lay-event=\'edit\'>编辑</a><a class=\'layui-btn layui-btn-danger layui-btn-xs\' lay-event=\'stop\'>停用</a></div>'}
		    ]]
		});
	
        //监听工具条
        table.on('tool(test)', function(obj){ //注：tool是工具条事件名，test是table原始容器的属性 lay-filter="对应的值"
            var data = obj.data; //获得当前行数据
            var layEvent = obj.event; //获得 lay-event 对应的值
            var tr = obj.tr;
            if(layEvent === 'stop'){
                layer.confirm('是否要停用该公告', function(index){
                    $.ajax({
                        url:"/announcement/update.do?id="+ data.id + "&" +"modifydatetime="+ data.modifydatetime+ "&" +"state="+ 1 + "&" +"title="+ data.title,
                        type: "POST",
                        data:id,
                        success: function(result){
    						layer.close(index);
    						if (result.success==true){
    							layer.alert('提交状态成功');
    							parent.location.reload();
    						}else{
    							layer.alert('提交状态失败，'+result.msg, {icon:5,title:"出错提示"});
    						}
    					},
                    })
                    layer.close(index);
                    //向服务端发送删除指令
               
                });
                
            }
            if(layEvent === 'edit'){
                window.WeAdminEdit("编辑","./edit.html",data,600,400)            }
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
                    , cols: [[ //表头
                        {field: 'id', title: '序号', width: 80, sort: true, fixed: 'left'}
                        , {field: 'title', title: '标题', width: 220}
                        , {field: 'content', title: '内容', width: 400}
                        , {
                            field: 'state', title: '状态', width: 120,
                            templet: function (d) {
                                if (d.state == 1) {
                                    return "已禁用";
                                } else {
                                    return "已启用";
                                }
                            }
                        }
                        , {field: 'createbyName', title: '创建人', width: 80}
                        , {field: 'modifybyName', title: '修改人', width: 80}
                        , {field: 'createtime', title: '创建时间', width: 200}
                        , {fixed: 'right', title: '操作',width:150, align:'center',toolbar:'<div><a class=\'layui-btn layui-btn-xs\' lay-event=\'edit\'>编辑</a><a class=\'layui-btn layui-btn-danger layui-btn-xs\' lay-event=\'stop\'>停用</a></div>'}
                    ]]
                });
            });
        });
    }