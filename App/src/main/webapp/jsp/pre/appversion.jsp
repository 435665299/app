<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="ctx" value="${pageContext.request.contextPath }" />
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="${ctx}/statics/css/colorpicker.css" />
<link rel="stylesheet" href="${ctx}/statics/css/datepicker.css" />
<link rel="stylesheet" href="${ctx}/statics/css/uniform.css" />
<link rel="stylesheet" href="${ctx}/statics/css/select2.css" />	
<title>查看信息</title>
</head>
<body>
	<%@include file="/jsp/common/header.jsp"%>
	<%@include file="/jsp/common/sidebar01.jsp"%>
	
	<div id="content">

			<div class="container-fluid">
				<div class="row-fluid">
					<div class="span12">
						<div class="widget-box">
							<div class="widget-content nopadding">
								<form class="form-horizontal" method="post" action="${ctx}/updateApp?id=${appInfo.id}" name="basic_validate" id="basic_validate" novalidate="novalidate" />
                                    <div class="control-group">
                                        <label class="control-label">软件名称*</label>
                                        <div class="controls">
                                            <input type="text" name="softwareName" id="required" value="${appInfo.softwareName}" disabled="disabled"/>
                                        </div>
                                    </div>
                                    <div class="control-group">
                                        <label class="control-label">APK名称*</label>
                                        <div class="controls">
                                            <input type="text" name="APKName" id="required" disabled="disabled" value="${appInfo.APKName}"/>
                                        </div>
                                    </div>
                                    <div class="control-group">
                                        <label class="control-label">支持ROM*</label>
                                        <div class="controls">
                                            <input type="text" name="supportROM" id="required" value="${appInfo.supportROM}" disabled="disabled"/>
                                        </div>
                                    </div>
                                    <div class="control-group">
                                        <label class="control-label">界面语言*</label>
                                        <div class="controls">
                                            <input type="text" name="interfaceLanguage" id="required" value="${appInfo.interfaceLanguage} "/>
                                        </div>
                                    </div>
                                    <div class="control-group">
                                        <label class="control-label">软件大小*</label>
                                        <div class="controls">
                                            <input type="text" name="softwareSize" id="number" value="${appInfo.softwareSize}"/>
                                        </div>
                                    </div>
                                    <div class="control-group">
                                        <label class="control-label">下载次数*</label>
                                        <div class="controls">
                                            <input type="text" name="downloads" id="number" value="${appInfo.downloads}" disabled="disabled"/>
                                        </div>
                                    </div>
                                    <div class="control-group">
                                        <label class="control-label">所属平台*</label>
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
                                        <label class="control-label">所属分类*</label>
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
                                        <label class="control-label">APP状态*</label>
                                        <div class="controls">
                                            <input type="text" disabled="disabled" name="required" id="required" value="${appInfo.statusDictionary.valueName}"/>
                                        </div>
                                    </div>
                                    <div class="control-group">
                                        <label class="control-label">应用简介*</label>
                                        <div class="controls">
                                            <textarea name="appInfo" rows="3" cols="3" disabled="disabled">${appInfo.appInfo}
											</textarea>
                                        </div>
                                    </div>
                                    <div class="form-actions">
                                        <input type="button" name="back" value="返回" onclick="javascript:history.go(-1);" class="btn btn-primary"/>
                                    </div>
                                </form>
							</div>
						</div>			
					</div>
				</div>
				
						<%@include file="/jsp/common/version.jsp" %>	
				
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