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
			      ,{field: 'nickname', title: '名称', width:100, align:'center'}
			      ,{field: 'sex', title: '性别', width:100, align:'center',
			    	  templet: function(d){
							if(d==1){
								return "男";
							}else{
								return "女";
							}
			    	      }}
			      ,{field: 'mgr', title: '上级', width:100, align:'center'}
			      ,{field: 'mobile', title: '手机号', width:150, align:'center'}
			      ,{field: 'email', title: '邮箱', width:150, align:'center'}
			      ,{field: 'departmentId', title: '部门', width:100, align:'center'}
		    ]]
		});
	});

	
function searchParams() {
	var params = {};
    params.nickname = $('#nickname').val();
	return params;
}


