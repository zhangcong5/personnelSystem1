/*debugger;
layui.extend({
	admin: '{/}../../static/js/admin'
});
layui.use(['form', 'admin', 'jquery', 'table', 'layer'], function() {
	var form = layui.form,
		admin = layui.admin,
		$ = layui.jquery,
		table = layui.table,
		layer = layui.layer;

	//自定义验证规则
	form.verify({
		nikename: function(value) {
			if(value.length > 255) {
				return '标题至多得255个字符啊';
			}
		},
	});

	//监听提交
	form.on('submit(add)', function(data) {
		$.ajax({
			url:"/announcement/insert.do",
			type:"POST",
			data:data.field,
			contentType:"application/x-www-form-urlencoded;charset=utf-8",
			success:function(result){
				if (result.result=="success")
				{
					layer.alert('提交状态成功');
					parent.location.reload();
				}else{
					layer.alert('提交状态失败，'+result.msg, {icon:5,title:"出错提示"});
				}
				layer.closeAll('iframe')
			}
		})
	});
});*/ 

layui.extend({
	admin: '{/}../../static/js/admin'
});
layui.use(['form', 'admin', 'jquery', 'table', 'layer'], function() {
	var form = layui.form,
		admin = layui.admin,
		$ = layui.jquery,
		table = layui.table,
		layer = layui.layer;




	//自定义验证规则
	form.verify({
		title: function(value) {
			if(value.length > 255) {
				return '标题至多得255个字符啊';
			}
		},
	});

	//监听提交
	form.on('submit(add)', function(data) {
        var title = document.getElementById("title").value,
            content = document.getElementById("content").value;
		console.log(title)
        console.log(content)
		if (title == "" || null == title){
            layer.msg("标题不允许为空!", {time: 2000});
            return false;
		}
        if (content == "" || null == content){
            layer.msg("内容不允许为空!", {time: 2000});
            return false;
        }
		$.ajax({
			url:"/announcement/insert.do",
			type:"POST",
			data:data.field,
            dataType:"json",
            contentType:"application/x-www-form-urlencoded;charset=utf-8",
			async: false,
            success: function (relult) {
                if (!relult.result=="success") {
                    parent.layer.msg("添加失败!", {time: 2000});
                    return false;
                } else {
                    parent.layer.msg("添加成功!", {time: 1000});
                    // 获得frame索引
                    var index = parent.layer.getFrameIndex(window.name);
                    //关闭当前frame
                    parent.layer.close(index);
                    //刷新公告页面
                    parent.location.reload();
                }
            }
		})
	});

}); 