<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="ctx" value="${pageContext.request.contextPath }" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
		<div id="sidebar">
			<a href="#" class="visible-phone"><i class="icon icon-home"></i> Dashboard</a>
			<ul>
				<li class="submenu">
					<a href="#"><i class="icon icon-th-list"></i> <span>APP管理</span> <span class="label">1</span></a>
					<ul>
						<li><a href="form-common.html">APP审核</a></li>
						<li><a href="form-common.html">广告推广</a></li>
					</ul>
				</li>
				<li class="submenu">
					<a href="#"><i class="icon icon-file"></i> <span>用户管理</span> <span class="label"></span></a>
					<ul>
						<li><a href="invoice.html">用户管理</a></li>
					</ul>
				</li>
				<li class="submenu">
					<a href="#"><i class="icon icon-file"></i> <span>基础数据维护</span> <span class="label"></span></a>
					<ul>
						<li><a href="invoice.html">基础数据维护</a></li>
					</ul>
				</li>
			</ul>		
		</div>
		
		
</body>
</html>