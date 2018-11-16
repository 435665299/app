$(document).ready(function() {
	$(".appdelete").click(function() {
		if (confirm("确定删除吗")) {
			alert("删除成功");
			return true;
		}
		return false;
	});
	
	$(".appup").click(function() {
		if (confirm("确定上架吗")) {
			alert("上架成功");
			return true;
		}
		return false;
	});
	
	$(".appdown").click(function() {
		if (confirm("确定下架吗")) {
			alert("下架成功");
			return true;
		}
		return false;
	});
	
	
	
});
