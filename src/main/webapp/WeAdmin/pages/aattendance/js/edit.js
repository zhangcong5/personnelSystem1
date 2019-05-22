layui.extend({
    admin: '{/}../../static/js/admin'
});
layui.use(['form', 'admin', 'jquery', 'table', 'layer'], function() {
    var form = layui.form,
        admin = layui.admin,
        $ = layui.jquery,
        table = layui.table,
        layer = layui.layer;


    //监听提交
    form.on('submit(edit)', function(data) {

        var state = document.getElementById("state").value,
            id = document.getElementById("id").value;
        data = {
            id:id,
            state:state,
        }

        $.ajax({
            url:"/attendance/update.do",
            type:"POST",
            // where:{id:id,title:title,content:content,modifydatetime:mytime},
            dataType:"json",
            contentType:"application/x-www-form-urlencoded;charset=utf-8",
            async: false,
            data:data,
            success: function (data) {
                if (data.result=="success") {
					layer.alert('提交状态成功');
					parent.location.reload();
                } else {
                	layer.alert('提交状态失败，'+data.msg, {icon:5,title:"出错提示"});
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