$(function () {
    var id = window.location.href.split('?')[1].split('=')[1];
    $.ajax({
        url:"/department/delete.do?id="+ id,
        type: "POST",
        data:id,
        success:function(res){
			if(res.success){
				notice(res.message,'success');
				window.location.href="department-list.html";
			}else{
				notice(res.message,"error")
			}
        }
    })
})

function notice(message,type){
    top.Notice('showNotice',{
        title:"信息提示",
        text:message,
        type:type
});
}
