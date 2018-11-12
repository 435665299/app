<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="ctx" value="${pageContext.request.contextPath }" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="${ctx}/statics/css/colorpicker.css" />
<link rel="stylesheet" href="${ctx}/statics/css/datepicker.css" />
<link rel="stylesheet" href="${ctx}/statics/css/uniform.css" />
<link rel="stylesheet" href="${ctx}/statics/css/select2.css" />	
<title>App修改</title>
</head>
<body>
	<%@include file="/jsp/common/header.jsp"%>
	<%@include file="/jsp/common/sidebar01.jsp"%>

	<div id="content">
			<div id="content-header">
				<h1>信息修改</h1>
			</div>
			<div class="container-fluid">
				<div class="row-fluid">
					<div class="span12">
						<div class="widget-box">
							<div class="widget-content nopadding">
								<form class="form-horizontal" method="post" action="#" name="basic_validate" id="basic_validate" novalidate="novalidate" />
                                    <div class="control-group">
                                        <label class="control-label">软件名称</label>
                                        <div class="controls">
                                            <input type="text" name="required" id="required" value="${appInfo.softwareName}"/>
                                        </div>
                                    </div>
                                    <div class="control-group">
                                        <label class="control-label">APK名称</label>
                                        <div class="controls">
                                            <input type="text" name="required" id="required" disabled="disabled" value="${appInfo.APKName}"/>
                                        </div>
                                    </div>
                                    <div class="control-group">
                                        <label class="control-label">支持ROM</label>
                                        <div class="controls">
                                            <input type="text" name="required" id="required" value="${appInfo.supportROM}"/>
                                        </div>
                                    </div>
                                    <div class="control-group">
                                        <label class="control-label">界面语言</label>
                                        <div class="controls">
                                            <input type="text" name="required" id="required" value="${appInfo.interfaceLanguage}"/>
                                        </div>
                                    </div>
                                    <div class="control-group">
                                        <label class="control-label">软件大小</label>
                                        <div class="controls">
                                            <input type="text" name="number" id="number" value="${appInfo.softwareSize}"/>
                                        </div>
                                    </div>
                                    <div class="control-group">
                                        <label class="control-label">下载次数</label>
                                        <div class="controls">
                                            <input type="text" name="number" id="number" value="${appInfo.downloads}"/>
                                        </div>
                                    </div>
                                    <div class="control-group">
                                        <label class="control-label">所属平台</label>
                                        <div class="controls">
                                            <select name="appFlatForm" style="width: 691px;">
													<c:if test="${flatFormList != null }">
														<option value="${appInfo.dataDictionary.typeCode}">${appInfo.dataDictionary.typeName}</option>
														<c:forEach var="flatForm" items="${flatFormList}">
															<option value="${flatForm.typeCode}">${flatForm.typeName}</option>
														</c:forEach>
													</c:if>
											</select>
                                        </div>
                                    </div>
                                    <div class="control-group">
                                        <label class="control-label">一级分类</label>
                                        <div class="controls">
                                            <select name="categoryLevel1" style="width: 691px;">
													<c:if test="${categoryLevel1List != null }">
														<option value="0">----请选择----</option>
														<c:forEach var="categoryLevel1"
															items="${categoryLevel1List}">
															<option value="${categoryLevel1.categoryCode}">${categoryLevel1.categoryName}</option>
														</c:forEach>
													</c:if>
											</select>
                                        </div>
                                    </div>
                                    <div class="control-group">
                                        <label class="control-label">二级平台</label>
                                        <div class="controls">
                                            <select name="categoryLevel2" style="width: 691px;">
													<c:if test="${categoryLevel2List != null }">
														<option value="0">----请选择----</option>
														<c:forEach var="categoryLevel2"
															items="${categoryLevel2List}">
															<option value="${categoryLevel2.categoryCode}">${categoryLevel2.categoryName}</option>
														</c:forEach>
													</c:if>
											</select>
                                        </div>
                                    </div>
                                    <div class="control-group">
                                        <label class="control-label">三级分类</label>
                                        <div class="controls">
                                            <select name="categoryLevel3" style="width: 691px;">
													<c:if test="${categoryLevel3List != null }">
														<option value="0">----请选择----</option>
														<c:forEach var="categoryLevel3"
															items="${categoryLevel3List}">
															<option value="${categoryLevel3.categoryCode}">${categoryLevel3.categoryName}</option>
														</c:forEach>
													</c:if>
											</select>
                                        </div>
                                    </div>
                                    <div class="control-group">
                                        <label class="control-label">APP状态</label>
                                        <div class="controls">
                                            <input type="text" disabled="disabled" name="required" id="required" value="${appInfo.statusDictionary.valueName}"/>
                                        </div>
                                    </div>
                                    <div class="control-group">
                                        <label class="control-label">应用简介</label>
                                        <div class="controls">
                                            <textarea rows="3" cols="3">${appInfo.appInfo}
											</textarea>
                                        </div>
                                    </div>
                                    <div class="form-actions">
                                        <input type="submit" value="保存" class="btn btn-primary" />
                                        <input type="button" name="back" value="返回" onclick="javascript:history.go(-1);" class="btn btn-primary"/>
                                    </div>
                                </form>
							</div>
						</div>			
					</div>
				</div>
				
				<div class="row-fluid">
					<div id="footer" class="span12">
						2018 &copy; Unicorn Admin. Brought to you by <a href="https://wrapbootstrap.com/user/diablo9983">diablo9983</a>
					</div>
				</div>
			</div>
		</div>



            <script src="${ctx}/statics/js/jquery.min.js"></script>
            <script src="${ctx}/statics/js/jquery.ui.custom.js"></script>
            <script src="${ctx}/statics/js/bootstrap.min.js"></script>
            <script src="${ctx}/statics/js/jquery.uniform.js"></script>
            <script src="${ctx}/statics/js/select2.min.js"></script>
            <script src="${ctx}/statics/js/jquery.validate.js"></script>
            <script src="${ctx}/statics/js/unicorn.js"></script>
            <script src="${ctx}/statics/js/unicorn.form_validation.js"></script>
</body>
</html>