$(document).ready(function() {
	$("#appDelete").click(function() {
		if (confirm("确定删除吗")) {
			alert("删除成功");
			return true;
		}
		return false;
	});
});
