package com.by.dao;

import com.by.entity.DataDictionary;
import com.by.entity.StatusDictionary;

import java.util.List;

import com.by.entity.AppCategory;
import com.by.entity.AppInfo;

public interface AppCategoryDaoMapper {
	/**
	 * 查询所有的APP状态
	 */
	public List<StatusDictionary> queryStatus();
	
	/**
	 * 查询所属平台
	 */
	public List<DataDictionary> queryFlatform();
	
	/**
	 * 查询分类
	 */
	public List<AppCategory> queryCategoryL1();
	public List<AppCategory> queryCategoryL2();
	public List<AppCategory> queryCategoryL3();
	/**
	 * 查询所有APP列表
	 * @return
	 */
	public List<AppInfo> queryAppInfo();
}

