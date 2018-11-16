package com.by.service;

import java.math.BigDecimal;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.by.dao.AppVersionDaoMapper;
import com.by.entity.AppVersion;

@Service
public class AppVersionService {
	@Autowired
	private AppVersionDaoMapper appVersionDaoMapper;
	
	public List<AppVersion> selectAppVersion(Integer appId){
		return appVersionDaoMapper.selectAppVersion(appId);		
	}
	
	public void addAppVersion(String versionNo,Integer appId,BigDecimal versionSize,
			String versionInfo,String apkFileName){
		appVersionDaoMapper.addAppVersion(versionNo, appId, versionSize, versionInfo, apkFileName);
	}
	
	public void updateVersionId(Integer id,String versionNo){
		appVersionDaoMapper.updateVersionId(id, versionNo);
	}
}
