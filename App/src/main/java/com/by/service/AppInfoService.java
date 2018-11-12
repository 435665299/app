package com.by.service;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.by.dao.AppInfoDaoMapper;
import com.by.entity.AppInfo;

@Service
public class AppInfoService {
	@Autowired
	private AppInfoDaoMapper appInfoDaoMapper;
	
	public AppInfo selectAppInfoById(Integer id){
		return appInfoDaoMapper.selectAppInfoById(id);		
	}
	
	public List<AppInfo> selectAppInfo(String softwareName,
			Integer appStatus,Integer appFlatForm,
			Integer categoryLevel1,Integer categoryLevel2,
			Integer categoryLevel3){
		return appInfoDaoMapper.selectAppInfo(softwareName, appStatus, appFlatForm, categoryLevel1, categoryLevel2, categoryLevel3);		
	}
	
	public boolean deleteAppInfo(Integer id){
		appInfoDaoMapper.deleteAppInfo(id);
		return true;		
	}
	
	public boolean updateAppInfo(Integer id,String softwareName,String supportROM,
			String interfaceLanguage,BigDecimal softwareSize,
			Integer downloads,Integer flatformId,
			Integer categoryLevel1,Integer categoryLevel2,
			Integer categoryLevel3,String appInfo){
		appInfoDaoMapper.updateAppInfo(id, softwareName, supportROM, interfaceLanguage, softwareSize, downloads, flatformId, categoryLevel1, categoryLevel2, categoryLevel3, appInfo);		
				return true;
		
	}
}
