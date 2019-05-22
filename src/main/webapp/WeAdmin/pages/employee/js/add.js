debugger;
			layui.extend({
				admin: '{/}../../static/js/admin'
			});
			layui.use(['form', 'admin', 'jquery', 'table', 'layer'], function() {
				var form = layui.form,
					admin = layui.admin,
					$ = layui.jquery,
					table = layui.table,
					layer = layui.layer;
				debugger;
				//自定义验证规则
				form.verify({
					nikename: function(value) {
						if(value.length > 255) {
							return '标题至多得255个字符啊';
						}
					},
					pass: [/(.+){6,12}$/, '密码必须6到12位'],
					repass: function(value) {
						if($('#pass').val() != $('#repass').val()) {
							return '两次密码不一致';
						}
					}
				});

				//监听提交
				form.on('submit(add)', function(data) {
			        var nickname = document.getElementById("nickname").value,
			        	sex = document.getElementById("sex").value,
			        	mgr = document.getElementById("mgr").value,
			        	salary = document.getElementById("salary").value,
			        	mobile = document.getElementById("mobile").value,
			        	email = document.getElementById("email").value,
/*			        	hiredate = document.getElementById("hiredate").value,
			        	terminationDate = document.getElementById("terminationDate").value,*/
			        	password = document.getElementById("repass").value;
                    data = {
                        nickname:nickname,
                        sex:sex,
                        mgr:mgr,
                        salary:salary,
                        mobile:mobile,
                        email:email,
                        password:password,

					}
			        debugger;
					if (nickname == "" || null == nickname){
			            layer.msg("昵称不允许为空!", {time: 2000});
			            return false;
					}
					if (salary == "" || null == salary){
						layer.msg("薪水不允许为空!", {time: 2000});
						return false;
					}
/*			        if (hiredate == "" || null == hiredate){
			            layer.msg("入职时间不允许为空!", {time: 2000});
			            return false;
			        }*/
					$.ajax({
						url:"/employee/insert.do",
						type:"POST",
						data:data,
						dataType:"json",
						contentType:"application/x-www-form-urlencoded;charset=utf-8",
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