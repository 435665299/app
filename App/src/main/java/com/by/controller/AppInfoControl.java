package com.by.controller;

import java.math.BigInteger;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.by.entity.AppInfo;
import com.by.service.AppInfoService;

@Controller
public class AppInfoControl {
	@Autowired
	private AppInfoService appInfoService;
	@RequestMapping(value="/selectApp",method=RequestMethod.POST)
	public String selectApp(HttpServletRequest request,HttpServletResponse response){
		String softwareName = request.getParameter("softwareName");
		Integer appStatus = Integer.valueOf(request.getParameter("appStatus"));
		Integer appFlatForm = Integer.valueOf(request.getParameter("appFlatForm"));
		Integer categoryLevel1 = Integer.valueOf(request.getParameter("categoryLevel1"));
		Integer categoryLevel2 = Integer.valueOf(request.getParameter("categoryLevel2"));
		Integer categoryLevel3 = Integer.valueOf(request.getParameter("categoryLevel3"));
		request.setAttribute("softwareName", softwareName);
		List<AppInfo> appInfoList = appInfoService.selectAppInfo(softwareName, appStatus, appFlatForm, categoryLevel1, categoryLevel2, categoryLevel3);
		request.setAttribute("appInfoList", appInfoList);		
		return "forward:/jsp/pre/maintain.jsp";		
	}
	@RequestMapping(value="/deleteApp",method=RequestMethod.POST)
	public String deleteAppInfo(HttpServletRequest request,HttpServletResponse response){
		Integer id = Integer.valueOf(request.getParameter("id"));
		appInfoService.deleteAppInfo(id);
		return "forward:/jsp/pre/maintain.jsp";		
	}
	@RequestMapping(value="/selectAppById",method=RequestMethod.GET)
	public String selectAppInfoById(HttpServletRequest request,HttpServletResponse response){
		Integer id = Integer.valueOf(request.getParameter("id"));
		AppInfo appInfo = appInfoService.selectAppInfoById(id);
		request.setAttribute("appInfo", appInfo);
		return "forward:/jsp/pre/appmodify.jsp";		
	}
	@RequestMapping(value="/updateApp",method=RequestMethod.POST)
	public String updateAppInfo(HttpServletRequest request,HttpServletResponse response){
		
		
		return "/pre/maintain";		
	}
	
	
}
