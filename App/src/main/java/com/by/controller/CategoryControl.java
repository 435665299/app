package com.by.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.by.entity.AppCategory;
import com.by.entity.AppInfo;
import com.by.entity.DataDictionary;
import com.by.entity.StatusDictionary;
import com.by.service.AppCategoryService;

@Controller
public class CategoryControl {
	@Autowired
	private AppCategoryService appCategoryService;
	@RequestMapping(value="/toAppList")
	public String toAppList(HttpServletRequest request,HttpServletResponse response){
		List<StatusDictionary> statusList = appCategoryService.queryStatus();
		List<DataDictionary> flatFormList = appCategoryService.queryFlatform();
		List<AppCategory> categoryLevel1List = appCategoryService.queryCategoryL1();
		List<AppCategory> categoryLevel2List = appCategoryService.queryCategoryL2();
		List<AppCategory> categoryLevel3List = appCategoryService.queryCategoryL3();
		List<AppInfo> appInfoList = appCategoryService.queryAppInfo();
		request.getSession().setAttribute("statusList", statusList);
		request.getSession().setAttribute("flatFormList", flatFormList);
		request.getSession().setAttribute("categoryLevel1List",categoryLevel1List);
		request.getSession().setAttribute("categoryLevel2List", categoryLevel2List);
		request.getSession().setAttribute("categoryLevel3List", categoryLevel3List);
		request.getSession().setAttribute("appInfoList", appInfoList);
		return "forward:/jsp/pre/maintain.jsp";		
	}
}
