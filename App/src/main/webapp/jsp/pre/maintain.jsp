<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="ctx" value="${pageContext.request.contextPath }" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="${ctx}/statics/css/uniform.css" />
<link rel="stylesheet" href="${ctx}/statics/css/select2.css" />
<link rel="stylesheet" href="${ctx}/statics/css/control.css" />
class="skin-color" />
<title>APP维护</title>
</head>
<body>
	<%@include file="/jsp/common/header.jsp"%>
	<%@include file="/jsp/common/sidebar01.jsp"%>

	<div id="content">
		<div id="content-header">
			<h1>APP信息管理维护</h1>
		</div>
		<div id="breadcrumb">
			<a href="#" title="Go to Home" class="tip-bottom"><i
				class="icon-home"></i>APP应用管理</a> <a href="#" class="current">APP维护</a>
		</div>
		<div class="container-fluid">
			<div class="row-fluid">
				<div class="span12">
					<div class="widget-box">
						<div class="widget-title">
							<span class="icon"> <i class="icon-th"></i>
							</span>
							<h5>APP应用查询</h5>
						</div>
						<div class="widget-content nopadding">
							<form action="${ctx}/selectApp" method="post">
								<table class="table table-bordered table-striped">
									<tbody>
										<tr>
											<td>软件名称&nbsp<input type="text" name="softwareName" style="width: 150px;"
												value="${softwareName}" /></td>
											<td><span>APP状态&nbsp</span> <select name="appStatus" style="width: 150px;">
													<c:if test="${statusList != null }">
														<option value="0">----请选择----</option>
														<c:forEach var="status" items="${statusList}">
															<option value="${status.valueCode}">${status.valueName}</option>
														</c:forEach>
													</c:if>
											</select></td>
											<td><span>所属平台&nbsp</span> <select name="appFlatForm" style="width: 150px;">
													<c:if test="${flatFormList != null }">
														<option value="0">----请选择----</option>
														<c:forEach var="flatForm" items="${flatFormList}">
															<option value="${flatForm.typeCode}">${flatForm.typeName}</option>
														</c:forEach>
													</c:if>
											</select></td>
										</tr>
										<tr>
											<td><span>一级分类&nbsp</span> <select name="categoryLevel1" style="width: 150px;">
													<c:if test="${categoryLevel1List != null }">
														<option value="0">----请选择----</option>
														<c:forEach var="categoryLevel1"
															items="${categoryLevel1List}">
															<option value="${categoryLevel1.categoryCode}">${categoryLevel1.categoryName}</option>
														</c:forEach>
													</c:if>
											</select></td>
											<td><span>二级分类&nbsp</span> <select name="categoryLevel2" style="width: 150px;">
													<c:if test="${categoryLevel2List != null }">
														<option value="0">----请选择----</option>
														<c:forEach var="categoryLevel2"
															items="${categoryLevel2List}">
															<option value="${categoryLevel2.categoryCode}">${categoryLevel2.categoryName}</option>
														</c:forEach>
													</c:if>
											</select></td>
											<td><span>三级分类&nbsp</span> <select name="categoryLevel3" style="width: 150px;">
													<c:if test="${categoryLevel3List != null }">
														<option value="0">----请选择----</option>
														<c:forEach var="categoryLevel3"
															items="${categoryLevel3List}">
															<option value="${categoryLevel3.categoryCode}">${categoryLevel3.categoryName}</option>
														</c:forEach>
													</c:if>
											</select></td>
										</tr>
									</tbody>
								</table>
								<div class="form-actions">
									<button type="submit" class="btn btn-primary">查询</button>
								</div>
							</form>
						</div>
					</div>

					<div class="widget-box">
						<div class="widget-title">
							<h5>查询APP基础信息</h5>
						</div>
						<div class="widget-content nopadding">
							<table class="table table-bordered data-table">
								<thead>
									<tr>
										<th>软件名称</th>
										<th>APK名称</th>
										<th>软件大小(单位：M)</th>
										<th>所属平台</th>
										<th>所属分类</th>
										<th>状态</th>
										<th>下载次数</th>
										<th>最新版本号</th>
										<th>操作</th>
									</tr>
								</thead>
								<tbody>
									<c:forEach var="appInfo" items="${appInfoList}">
										<tr class="gradeA">
											<td>${appInfo.softwareName}</td>
											<td>${appInfo.APKName}</td>
											<td>${appInfo.softwareSize}</td>
											<td>${appInfo.dataDictionary.typeName}</td>
											<td>
												<%-- 												${appInfo.categoryLevel1}> --%> <%-- 												${appInfo.categoryLevel2}> --%>
												${appInfo.appCategory.categoryName}
											</td>
											<td>${appInfo.statusDictionary.valueName}</td>
											<td>${appInfo.downloads}</td>
											<td>${appInfo.versionId}</td>
											<td class="btn-group">
											<button type="button" class="btn btn-default dropdown-toggle" 
												data-toggle="dropdown">
												点击操作 <span class="caret"></span>
											</button>
												<ul class="dropdown-menu" role="menu">													
													<li><a href="${ctx}/selectversion?appId=${appInfo.id}">新增版本</a></li>
													<li><a href="#">修改版本</a></li>
													<li><a href="${ctx}/selectAppById?id=${appInfo.id}">修改</a></li>
													<li><a href="${ctx}/lookApp?id=${appInfo.id}&appId=${appInfo.id}">查看</a></li>
													<li><a class="appdelete" href="${ctx}/deleteApp?id=${appInfo.id}">删除</a></li>
													<li>
														<c:choose>
															<c:when test="${appInfo.statusDictionary.valueName == '审核已通过' || appInfo.statusDictionary.valueName == '已下架'}">
																<a class="appup" href="${ctx}/updateStatus?id=${appInfo.id}&status=4">上架</a>
															</c:when>
															<c:otherwise>
																<a href="javascript:return false;" style="opacity: 0.2">上架</a>
															</c:otherwise>
														</c:choose>
													</li>
													<li>
														<c:choose>
															<c:when test="${appInfo.statusDictionary.valueName == '已上架' }">
																<a class="appdown" href="${ctx}/updateStatus?id=${appInfo.id}&status=5">下架</a>
															</c:when>
															<c:otherwise>
																<a href="javascript:return false;" style="opacity: 0.2">下架</a>
															</c:otherwise>
														</c:choose>
													</li>
												</ul>
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
	</div>
	<script src="${ctx}/statics/js/jquery.min.js"></script>
	<script src="${ctx}/statics/js/jquery.ui.custom.js"></script>
	<script src="${ctx}/statics/js/bootstrap.min.js"></script>
	<script src="${ctx}/statics/js/jquery.uniform.js"></script>
	<script src="${ctx}/statics/js/select2.min.js"></script>
	<script src="${ctx}/statics/js/unicorn.js"></script>
	<script src="${ctx}/statics/js/jquery.dataTables.min.js"></script>
	<script src="${ctx}/statics/js/unicorn.tables.js"></script>
	<script src="${ctx}/statics/js/control.js"></script>
	<script src="${ctx}/statics/js/appdelete.js"></script>
</body>
</html>