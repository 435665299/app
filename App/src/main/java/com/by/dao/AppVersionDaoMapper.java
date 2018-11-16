package com.by.dao;

import java.math.BigDecimal;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.http.client.InterceptingAsyncClientHttpRequestFactory;

import com.by.entity.AppVersion;

public interface AppVersionDaoMapper {
	/**
	 * ��ѯ��ʷ�汾��Ϣ
	 */
	
	public List<AppVersion> selectAppVersion(@Param("appId")Integer appId);
	
	/**
	 * �����汾��Ϣ
	 */
	public void addAppVersion(@Param("versionNo")String versionNo,@Param("appId")Integer appId,@Param("versionSize")BigDecimal versionSize,
			@Param("versionInfo")String versionInfo,@Param("apkFileName")String apkFileName);
	
	/**
	 * ����app_info��汾id
	 */
	public void updateVersionId(@Param("id")Integer id,@Param("versionNo")String versionNo);
}
