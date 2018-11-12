$("#caozuo li").first().click(function(){
	$("#caozuo li").slice(1,9).toggle("fast");
})

$(function(){
	$("#caozuo li").slice(1,9).css("display:none");
});