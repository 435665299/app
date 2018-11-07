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
					<a href="#"><i class="icon icon-th-list"></i> <span>APP应用管理</span> <span class="label">▼</span></a>
					<ul>
						<li><a href="form-common.html">APP维护</a></li>
					</ul>
				</li>
				<li class="submenu">
					<a href="#"><i class="icon icon-file"></i> <span>APP账户管理</span> <span class="label">▼</span></a>
					<ul>
						<li><a href="invoice.html">账户管理</a></li>
					</ul>
				</li>
			</ul>		
		</div>
		
		
</body>
</html>