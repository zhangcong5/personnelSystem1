$(function () {
    var id = window.location.href.split('?')[1].split('=')[1];
    $.ajax({
        url:"/employee/detail.do?id="+ id,
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
	$("#nickname").val(res.body.nickname);
	$("#mgr").val(res.body.mgr);
	$("#sex").setValue(res.body.sex);
	$("#salary").val(res.body.salary);
	$("#email").val(res.body.email);
	$("#mobile").val(res.body.mobile);
	$("#hiredate").val(res.body.hiredate);
	$("#terminationDate").val(res.body.terminationDate);
	$("#departmentId").setValue(res.body.departmentId);
//	$("#departmentId").attr("selectedValue",res.body.departmentId);
	$("#modifyDateTime").val(res.body.modifyDateTime);
}
