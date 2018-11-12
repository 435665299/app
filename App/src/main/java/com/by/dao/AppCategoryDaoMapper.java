package com.by.dao;

import com.by.entity.DataDictionary;
import com.by.entity.StatusDictionary;

import java.util.List;

import com.by.entity.AppCategory;
import com.by.entity.AppInfo;

public interface AppCategoryDaoMapper {
	/**
	 * ��ѯ���е�APP״̬
	 */
	public List<StatusDictionary> queryStatus();
	
	/**
	 * ��ѯ����ƽ̨
	 */
	public List<DataDictionary> queryFlatform();
	
	/**
	 * ��ѯ����
	 */
	public List<AppCategory> queryCategoryL1();
	public List<AppCategory> queryCategoryL2();
	public List<AppCategory> queryCategoryL3();
	/**
	 * ��ѯ����APP�б�
	 * @return
	 */
	public List<AppInfo> queryAppInfo();
}

