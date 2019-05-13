$("#insert-department").click(function() {
	var data = $('#department-insert-form').serializeArray();
	$.ajax({
		url:"/department/insert.do",
		data:data,
		contentType:"application/x-www-form-urlencoded;charset=utf-8",
		type:"POST",
		success:function(res){
			if(res.success){
				notice(res.message,'success');
				window.location.href="department-list.html";
			}else{
				notice(res.message,"error")
			}
		}
	})
});

function notice(message,type){
    top.Notice('showNotice',{
        title:"信息提示",
        text:message,
        type:type
});
}
