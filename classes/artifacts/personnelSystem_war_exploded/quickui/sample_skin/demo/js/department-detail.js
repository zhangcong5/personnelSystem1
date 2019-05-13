$(function () {
    var id = window.location.href.split('?')[1].split('=')[1];
    $.ajax({
        url:"/department/detail.do?id="+ id,
        type: "POST",
        data:id,
        success:function(res){
            if(res.success){
            	initCompleteDetail(res);
            }else {
                top.Notice('showNotice', {
                    title: "信息提示",
                    text: res.message,
                    type: "error"
                })
            }
        }
    })
})


function initCompleteDetail(res){
	$("#id").val(res.body.id);
	$("#departmentname").val(res.body.departmentname);
	$("#mobile").val(res.body.mobile);
	$("#modifyDateTime").val(res.body.modifyDateTime);
}
