<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="ctx" value="${pageContext.request.contextPath }" />
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>


		<div class="container-fluid">
			<div class="row-fluid">
				<div class="span12">
					
					<div class="widget-box">
						<div class="widget-title">
							<h5>历史版本列表</h5>
						</div>
						<div class="widget-content nopadding">
							<table class="table table-bordered data-table">
								<thead>
									<tr>
										<th>软件名称</th>
										<th>版本号</th>
										<th>版本大小(单位：M)</th>
										<th>发布状态</th>
										<th>APK文件下载</th>
										<th>最新更新时间</th>
									</tr>
								</thead>
								<tbody>
									<c:forEach var="version" items="${versions}">
										<tr class="gradeA">
											<td>${version.appInfo.softwareName}</td>
											<td>${version.versionNo}</td>
											<td>${version.versionSize}</td>
											<td>
												<c:if test="${version.publishStatus == 1}">
													预发布
												</c:if>
											</td>
											<td>${version.apkFileName}</td>
											<td>
											<fmt:formatDate value="${version.creationDate}" type="date" pattern="yyyy-MM-dd HH:mm"/>
											</td>
										</tr>
									</c:forEach>
								</tbody>
							</table>
						</div>
					</div>
				</div>
			</div>
		</div>
		
		
		
		



</body>
</html>