	var mytable = null;
	layui.use(['laydate', 'layer', 'table', 'carousel', 'upload', 'element'], function(){
        var laypage = layui.laypage //分页
            ,layer = layui.layer //弹层
            ,table = layui.table //表格
            ,element = layui.element; //元素操作
		mytable =  table.render({
			elem: '#aattendance-list'
			,url:'/attendance/list.do'
			,cellMinWidth: 100
			,method:'POST'
			,request: {
				pageName: 'page' //页码的参数名称，默认：page
				,limitName: 'pageSize' //每页数据量的参数名，默认：limit
			}
            //开启分页
            ,page: true
		    ,cols: [[ //表头
			      {field: 'id', title: '编号', width:80, sort: true, fixed: 'left', align:'center'}
			      ,{field: 'content', title: '申请内容', width:180, align:'center'}
			      ,{field: 'type', title: '单据类型', width:100, align:'center',
			    	  templet: function(d){
							if(d==0){
								return "外勤";
							}else if(d==2){
								return "加班";
							}else{
								return "请假";
							}
			    	      }}
			      ,{field: 'startingtime', title: '起始时间', width:200, align:'center'}
			      ,{field: 'endtime', title: '结束时间', width:200, align:'center'}
			      ,{field: 'number', title: '天数', width:80, align:'center'}
			      ,{field: 'state', title: '审批状态', width:150, align:'center',
			    	  templet: function(d){
							if(d==0){
								return "通过";
							}else if(d==1){
								return "未通过";
							}else{
								return "未审核";
							}
			    	      }}
		      ,{fixed: 'right', width:150, align:'center',toolbar:'<div><a class=\'layui-btn layui-btn-xs\' lay-event=\'detail\'>查看</a><a class=\'layui-btn layui-btn-xs\' lay-event=\'edit\'>编辑</a><a class=\'layui-btn layui-btn-danger layui-btn-xs\' lay-event=\'del\'>删除</a></div>'}
		    ]]
		});
		
		form.on('submit(search)', function (data) {
        	table.reload('mytable', {
        		where: {
        			txtUser: data.field.txtUser
        		}
        	});
            return false;
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

                });
            } else if(layEvent === 'edit'){
            	layer.alert('编辑行：<br>'+ JSON.stringify(data))
            }
        });
	});


