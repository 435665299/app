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
<title>修改版本信息</title>
</head>
<body>
	<%@include file="/jsp/common/header.jsp"%>
	<%@include file="/jsp/common/sidebar01.jsp"%>

	<div id="content">
		<%@include file="/jsp/common/version.jsp"%>

		<div class="row-fluid">
			<div class="span12">
				<div class="widget-box">
					<div class="widget-title">
						<h5>新增版本信息</h5>
					</div>
					<div class="widget-content nopadding">
						<form class="form-horizontal" action="${ctx}/addVersion?appId=${appId}" method="post">
						<div class="control-group">
							<label class="control-label">版本号</label>
							<div class="controls">
								<input type="text" name="versionNo" id="required"
									value="${appInfo.APKName}" />
							</div>
						</div>
						<div class="control-group">
							<label class="control-label">版本大小</label>
							<div class="controls">
								<input type="text" name="versionSize" id="required"
									value="${appInfo.supportROM}" />
							</div>
						</div>
						<div class="control-group">
							<label class="control-label">发布状态</label>
							<div class="controls">预发布</div>
						</div>
						<div class="control-group">
							<label class="control-label">版本简介</label>
							<div class="controls">
								<textarea name="versionInfo" rows="3" cols="3">${appInfo.appInfo}
											</textarea>
							</div>
						</div>
						<div class="control-group">
							<label class="control-label">apk文件</label>
							<div class="controls">
								<input type="text" name="apkFileName1" id="required"/>      
							</div>
						</div>
						<div class="form-actions">
							<input type="submit" value="保存" class="btn btn-primary" /> <input
								type="button" name="back" value="返回"
								onclick="javascript:history.go(-1);" class="btn btn-primary" />
						</div>
						</form>
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