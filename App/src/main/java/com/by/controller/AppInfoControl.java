package com.by.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.lang.ProcessBuilder.Redirect;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.type.IntegerTypeHandler;
import org.aspectj.weaver.ast.And;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.by.entity.AppInfo;
import com.by.entity.AppVersion;
import com.by.service.AppInfoService;
import com.by.service.AppVersionService;

@Controller
public class AppInfoControl {
	@Autowired
	private AppInfoService appInfoService;
	@Autowired
	private AppVersionService appVersionService;
	@RequestMapping(value = "/selectApp")
	public String selectApp(HttpServletRequest request, HttpServletResponse response) {
		String softwareName = null;
		Integer appStatus = 0;
		Integer appFlatForm = 0;
		Integer categoryLevel1 = 0;
		Integer categoryLevel2 = 0;
		Integer categoryLevel3 = 0;
		if (request.getParameter("softwareName") != null) {
			softwareName = request.getParameter("softwareName");
		}
		if (request.getParameter("appStatus") != null) {
			appStatus = Integer.valueOf(request.getParameter("appStatus"));
		}
		if (request.getParameter("appFlatForm") != null) {
			appFlatForm = Integer.valueOf(request.getParameter("appFlatForm"));
		}
		if (request.getParameter("categoryLevel1") != null) {
			categoryLevel1 = Integer.valueOf(request.getParameter("categoryLevel1"));
		}
		if (request.getParameter("categoryLevel2") != null) {
			categoryLevel2 = Integer.valueOf(request.getParameter("categoryLevel2"));
		}
		if (request.getParameter("categoryLevel3") != null) {
			categoryLevel3 = Integer.valueOf(request.getParameter("categoryLevel3"));
		}
		request.setAttribute("softwareName", softwareName);		
		List<AppInfo> appInfoList = appInfoService.selectAppInfo(softwareName, appStatus, appFlatForm, categoryLevel1,
				categoryLevel2, categoryLevel3);
		request.setAttribute("appInfoList", appInfoList);
		return "forward:/jsp/pre/maintain.jsp";
	}

	@RequestMapping(value = "/deleteApp", method = RequestMethod.GET)
	public String deleteAppInfo(HttpServletRequest request, HttpServletResponse response) {
		Integer id = Integer.valueOf(request.getParameter("id"));
		appInfoService.deleteAppInfo(id);
		return "redirect:/selectApp";
	}

	@RequestMapping(value = "/selectAppById", method = RequestMethod.GET)
	public String selectAppInfoById(HttpServletRequest request, HttpServletResponse response) {
		Integer id = Integer.valueOf(request.getParameter("id"));
		AppInfo appInfo = appInfoService.selectAppInfoById(id);
		request.setAttribute("appInfo", appInfo);
		return "forward:/jsp/pre/appmodify.jsp";
	}

	@RequestMapping(value = "/updateApp", method = RequestMethod.POST)
	public String updateAppInfo(HttpServletRequest request, HttpServletResponse response) {
		try {
			PrintWriter out = response.getWriter();
			Integer id = 0;
			String softwareName = null;
			String supportROM = null;
			String interfaceLanguage = null;
			BigDecimal softwareSize = null;
			Integer downloads = 0;
			Integer flatformId = 0;
			Integer categoryLevel1 = 0;
			Integer categoryLevel2 = 0;
			Integer categoryLevel3 = 0;
			String appInfo = null;
			if(request.getParameter("id")!=null){
				id = Integer.valueOf(request.getParameter("id"));
			}else {
				return "404";
			}
			if(request.getParameter("softwareName")!=null && request.getParameter("softwareName")!=""){
				softwareName = request.getParameter("softwareName");
			}else {
				out.print("<script language='javascript'>alert('软件名不能为空')</script>");
				out.write("<script type='text/javascript'>history.go(-1);</script>");
			}
			if(request.getParameter("supportROM")!=null && request.getParameter("supportROM")!=""){
				supportROM = request.getParameter("supportROM");
			}else {
				out.print("<script language='javascript'>alert('ROM不能为空')</script>");
				out.write("<script type='text/javascript'>history.go(-1);</script>");
			}
			if(request.getParameter("interfaceLanguage")!=null && request.getParameter("interfaceLanguage")!=""){
				interfaceLanguage = request.getParameter("interfaceLanguage");
			}else {
				out.print("<script language='javascript'>alert('支持语言不能为空')</script>");
				out.write("<script type='text/javascript'>history.go(-1);</script>");
			}
			if(request.getParameter("softwareSize")!=null){
				String size = request.getParameter("softwareSize");
				softwareSize = new BigDecimal(size);
			}else {
				out.print("<script language='javascript'>alert('软件大小不能为空')</script>");
				out.write("<script type='text/javascript'>history.go(-1);</script>");
			}
			if(request.getParameter("downloads")!=null){
				downloads = Integer.valueOf(request.getParameter("downloads"));
			}else {
				out.print("<script language='javascript'>alert('下载次数不能为空')</script>");
				out.write("<script type='text/javascript'>history.go(-1);</script>");
			}
			if(request.getParameter("appFlatForm")!=null && request.getParameter("appFlatForm")!="0"){
				flatformId = Integer.valueOf(request.getParameter("appFlatForm"));
			}else {
				out.print("<script language='javascript'>alert('所属平台不能为空')</script>");
				out.write("<script type='text/javascript'>history.go(-1);</script>");
			}
			if(request.getParameter("categoryLevel1")!=null && request.getParameter("categoryLevel1")!="0"){
				categoryLevel1 = Integer.valueOf(request.getParameter("categoryLevel1"));
			}else {
				out.print("<script language='javascript'>alert('一级分类不能为空')</script>");
				out.write("<script type='text/javascript'>history.go(-1);</script>");
			}
			if(request.getParameter("categoryLevel2")!=null && request.getParameter("categoryLevel2")!="0"){
				categoryLevel2 = Integer.valueOf(request.getParameter("categoryLevel2"));
			}else {
				out.print("<script language='javascript'>alert('二级分类不能为空')</script>");
				out.write("<script type='text/javascript'>history.go(-1);</script>");
			}
			if(request.getParameter("categoryLevel3")!=null && request.getParameter("categoryLevel3")!="0"){
				categoryLevel3 = Integer.valueOf(request.getParameter("categoryLevel3"));
			}else {
				out.print("<script language='javascript'>alert('三级分类不能为空')</script>");
				out.write("<script type='text/javascript'>history.go(-1);</script>");
			}
			if(request.getParameter("appInfo")!=null && request.getParameter("appInfo")!=""){
				appInfo = request.getParameter("appInfo");
			}else {
				out.print("<script language='javascript'>alert('应用简介不能为空')</script>");
				out.write("<script type='text/javascript'>history.go(-1);</script>");
			}
			appInfoService.updateAppInfo(id, softwareName, supportROM, interfaceLanguage, softwareSize, downloads, flatformId, categoryLevel1, categoryLevel2, categoryLevel3, appInfo);
			out.print("<script language='javascript'>alert('保存成功')</script>");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "404";
		}		
		return "redirect:/selectApp";
	}
	@RequestMapping(value="/updateStatus")
	public String updateStatus(HttpServletRequest request,HttpServletResponse response) {
		Integer id = null;
		Integer status = null;
		PrintWriter out;
		if (request.getParameter("id") != null) {
			id = Integer.valueOf(request.getParameter("id"));
		}
		if (request.getParameter("status") != null) {
			status = Integer.valueOf(request.getParameter("status"));
		}
		appInfoService.updateStatus(id, status);
		try {
			out = response.getWriter();
			out.print("<script language='javascript'>alert('修改成功')</script>");
			return "redirect:/selectApp";
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "404";
		}
	}
	
	@RequestMapping(value="/lookApp")
	public String lookApp(HttpServletRequest request){
		Integer id = Integer.valueOf(request.getParameter("id"));
		AppInfo appInfo = appInfoService.selectAppInfoById(id);
		request.setAttribute("appInfo", appInfo);
		Integer appId = null;
		if(request.getParameter("appId") != null){
			appId = Integer.valueOf(request.getParameter("appId"));
		}
		request.setAttribute("appId", appId);
		List<AppVersion> versions = appVersionService.selectAppVersion(appId);
		request.setAttribute("versions", versions);	
		return "/pre/appversion";
	}
	
}
