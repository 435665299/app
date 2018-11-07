<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="ctx" value="${pageContext.request.contextPath }" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>后台管理系统</title>
</head>
<body>
	<h1>APP信息管理平台</h1>
	<h4><a href="${ctx}/jsp/backlogin.jsp">后台管理系统 入口</a></h4>
	<h4><a href="${ctx}/jsp/login.jsp">开发者平台 入口</a></h4>
</body>
</html>