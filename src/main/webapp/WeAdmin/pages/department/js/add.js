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

				//监听提交
				form.on('submit(add)', function(data) {
					$.ajax({
						url:"/announcement/insert.do",
						type:"POST",
						data:data.field,
						contentType:"application/x-www-form-urlencoded;charset=utf-8",
						success:function(data){
							if(data.result=="success"){
								layer.msg("新增成功");
							}
							if(data.result=="error"){
								layer.msg("新增失败");
							}
							layer.closeAll('iframe')
						}
					})
				});
			}); 