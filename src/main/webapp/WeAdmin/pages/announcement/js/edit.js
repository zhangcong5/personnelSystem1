/*debugger;*/
/*				layui.use(['form', 'layer'], function() {
				$ = layui.jquery;
				var form = layui.form,
					layer = layui.layer;

				//自定义验证规则
				form.verify({
					title: function(value) {
						if(value.length > 200) {
							return '标题至多得255个字符啊';
						}
					},
					content: function(value) {
						if(value.length > 200) {
							return '标题至多得255个字符啊';
						}
					},
				});

				//监听提交
				form.on('submit(add)', function(data) {
					$.post(
							$.ajax({
								url:"/announcement/insert.do",
								type:"POST",
								data:data.field,
								contentType:"application/x-www-form-urlencoded;charset=utf-8",
								success:function(data){
									if(data.result=="success"){
										layer.alert("增加成功", {
											icon: 6
										}, function() {
											// 获得frame索引
											var index = parent.layer.getFrameIndex(window.name);
//											parent.location.reload();					
											parent.$('input[name="title"]').val(f.title);
											parent.$('input[name="content"]').val(f.content);
											parent.$('input[name="state"]').val(f.state);
											
											parent.addMember();
											//关闭当前frame
											parent.layer.close(index);
										});
										return false;
									}
									if(data.result=="error"){
										layer.msg("新增失败");
									}
									layer.closeAll('iframe')
								}
							})
						);
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
        nikename: function(value) {
            if(value.length > 255) {
                return '标题至多得255个字符啊';
            }
        },
    });

    function dateFtt(fmt,date)
    {
        var o = {
            "M+" : date.getMonth()+1,                 //月份
            "d+" : date.getDate(),                    //日
            "h+" : date.getHours(),                   //小时
            "m+" : date.getMinutes(),                 //分
            "s+" : date.getSeconds(),                 //秒
            "q+" : Math.floor((date.getMonth()+3)/3), //季度
            "S"  : date.getMilliseconds()             //毫秒
        };
        if(/(y+)/.test(fmt))
            fmt=fmt.replace(RegExp.$1, (date.getFullYear()+"").substr(4 - RegExp.$1.length));
        for(var k in o)
            if(new RegExp("("+ k +")").test(fmt))
                fmt = fmt.replace(RegExp.$1, (RegExp.$1.length==1) ? (o[k]) : (("00"+ o[k]).substr((""+ o[k]).length)));
        return fmt;
    }
    var crtTime = new Date();
    var date = dateFtt("yyyy-MM-dd hh:mm:ss",crtTime);
    console.log(date)
    //监听提交
    form.on('submit(edit)', function(data) {

        var title = document.getElementById("title").value,
            id = document.getElementById("id").value,
            content = document.getElementById("content").value,
            state = document.getElementById("state").value;
        data = {
            modifydatetime: date,
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

            success: function (relult) {
                if (!data.result=="success") {
                    parent.layer.msg("更新失败!", {time: 2000});
                    return false;
                } else {
                    parent.layer.msg("更新成功!", {time: 1000});
                    // 获得frame索引
                    var index = parent.layer.getFrameIndex(window.name);
                    //关闭当前frame
                    parent.layer.close(index);
                    //刷新公告页面
                    parent.layui.table.reload('testReload', {});
                }
            }
        })

    });
    // $("body").on("submit(add)",function(){
    //     var title = document.getElementById("title").value,
    //         content = document.getElementById("content").value;
    //     console.log(title)
    //     console.log(content)
    //     if (title == "" || null == title){
    //         layer.msg("标题不允许为空!", {time: 2000});
    //         return false;
    //     }
    //     if (content == "" || null == content){
    //         layer.msg("内容不允许为空!", {time: 2000});
    //         return false;
    //     }
    //     $.ajax({
    //         url:"/announcement/update.do",
    //         type:"POST",
    //         data:data.field,
    //         dataType:"json",
    //         contentType:"application/x-www-form-urlencoded;charset=utf-8",
    //         async: false,
    //         success: function (relult) {
    //             if (!data.result=="success") {
    //                 parent.layer.msg("添加失败!", {time: 2000});
    //                 return false;
    //             } else {
    //                 parent.layer.msg("添加成功!", {time: 1000});
    //                 // 获得frame索引
    //                 var index = parent.layer.getFrameIndex(window.name);
    //                 //关闭当前frame
    //                 parent.layer.close(index);
    //                 //刷新公告页面
    //                 parent.layui.table.reload('testReload', {});
    //             }
    //         }
    //     });
    // });
});