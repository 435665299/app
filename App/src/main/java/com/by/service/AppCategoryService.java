package com.by.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.by.dao.AppCategoryDaoMapper;
import com.by.entity.AppCategory;
import com.by.entity.AppInfo;
import com.by.entity.DataDictionary;
import com.by.entity.StatusDictionary;

@Service
public class AppCategoryService {
	@Autowired
	private AppCategoryDaoMapper appCategoryDaoMapper;
	
	/**
	 * ��ѯAPP״̬
	 * @return
	 */
	public List<StatusDictionary> queryStatus(){
		return appCategoryDaoMapper.queryStatus();		
	};
	
	/**
	 * ��ѯ����ƽ̨
	 */
	public List<DataDictionary> queryFlatform() {
		return appCategoryDaoMapper.queryFlatform();
	}
	
	/**
	 * ��ѯ����
	 */
	public List<AppCategory> queryCategoryL1() {
		return appCategoryDaoMapper.queryCategoryL1();
	}
	public List<AppCategory> queryCategoryL2() {
		return appCategoryDaoMapper.queryCategoryL2();
	}
	public List<AppCategory> queryCategoryL3() {
		return appCategoryDaoMapper.queryCategoryL3();
	}
	
	/**
	 * ��ѯ����APP
	 */
	public List<AppInfo> queryAppInfo(){
		return appCategoryDaoMapper.queryAppInfo();		
	}
}
