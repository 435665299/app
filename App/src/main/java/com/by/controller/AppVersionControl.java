package com.by.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.type.IntegerTypeHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.by.entity.AppVersion;
import com.by.service.AppVersionService;

@Controller
public class AppVersionControl {
	@Autowired
	private AppVersionService appVersionService;
	
	@RequestMapping(value="/selectversion")
	public String selectAppVersion(HttpServletRequest request,HttpServletResponse response){
		Integer appId = null;
		if(request.getParameter("appId") != null){
			appId = Integer.valueOf(request.getParameter("appId"));
		}
		request.setAttribute("appId", appId);
		List<AppVersion> versions = appVersionService.selectAppVersion(appId);
		request.setAttribute("versions", versions);
		return "/pre/updateversion";
	}
	@RequestMapping(value="/addVersion")
	public String addVersion(HttpServletRequest request,HttpServletResponse response) throws IOException{
		String versionNo = null;
		BigDecimal versionSize = null;
		String versionInfo = null;
		String apkFileName = null;
		PrintWriter out = response.getWriter();
		Integer appId = null;
		boolean flag = true;
		if(request.getParameter("appId")!=null){
			appId = Integer.valueOf(request.getParameter("appId"));
		}else {
			return "404";
		}
		if(request.getParameter("versionNo")!=null && request.getParameter("versionNo")!= ""){
			versionNo = request.getParameter("versionNo");
		}else {
			flag = false;
			out.print("<script language='javascript'>alert('版本号不能为空')</script>");
			out.write("<script type='text/javascript'>history.go(-1);</script>");
		}
		if(request.getParameter("versionSize")!=null){
			versionSize = new BigDecimal(request.getParameter("versionSize"));
		}else {
			flag = false;
			out.print("<script language='javascript'>alert('版本大小不能为空')</script>");
			out.write("<script type='text/javascript'>history.go(-1);</script>");
		}
		if(request.getParameter("versionInfo")!=null && request.getParameter("versionInfo")!= ""){
			versionInfo = request.getParameter("versionInfo");
		}else {
			flag = false;
			out.print("<script language='javascript'>alert('版本简介不能为空')</script>");
			out.write("<script type='text/javascript'>history.go(-1);</script>");
		}
		if(request.getParameter("apkFileName1")!=null && request.getParameter("apkFileName1")!= ""){
			apkFileName = request.getParameter("apkFileName1");
		}else {
			System.out.println(request.getParameter("apkFileName1"));
			flag = false;
			out.print("<script language='javascript'>alert('apk文件不能为空')</script>");
			out.write("<script type='text/javascript'>history.go(-1);</script>");
		}
		if(flag == true){
			appVersionService.addAppVersion(versionNo, appId, versionSize, versionInfo, apkFileName);
			appVersionService.updateVersionId(appId, versionNo);
			return "redirect:/selectApp";	
		}else{
			return "404";	
		}	
	}
}
