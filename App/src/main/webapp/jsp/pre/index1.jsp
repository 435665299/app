<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="ctx" value="${pageContext.request.contextPath }" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>APP开发者平台</title>
</head>
<body>
	<%@include file="/jsp/common/header.jsp"%>
	<%@include file="/jsp/common/sidebar01.jsp"%>
	<div id="content">
			<div id="content-header">
				<h1>欢迎你：${user.devName} | 角色：开发者账户</h1>
			</div>
	</div>
	<%@include file="/jsp/common/footer.jsp"%>
</body>
</html>