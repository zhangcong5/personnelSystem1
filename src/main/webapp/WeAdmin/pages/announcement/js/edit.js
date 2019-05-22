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
    form.on('submit(edit)', function(data) {

        var title = document.getElementById("title").value,
            id = document.getElementById("id").value,
            content = document.getElementById("content").value,
            state = document.getElementById("state").value,
            modifydatetime = document.getElementById("modifydatetime").value;
        data = {
            modifydatetime: modifydatetime,
            id:id,
			title:title,
            content:content,
            state:state,
        }
        console.log(id)
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
            url:"/announcement/update.do",
            type:"POST",
            // where:{id:id,title:title,content:content,modifydatetime:mytime},
            dataType:"json",
            contentType:"application/x-www-form-urlencoded;charset=utf-8",
            async: false,
            data:data,

            success: function (result) {
                if (!result.result=="success") {
                	layer.alert('提交状态失败，'+result.msg, {icon:5,title:"出错提示"});
					parent.location.reload();
                } else {
                	layer.alert('提交状态成功');
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