package com.by.dao;

import java.math.BigDecimal;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.http.client.InterceptingAsyncClientHttpRequestFactory;

import com.by.entity.AppVersion;

public interface AppVersionDaoMapper {
	/**
	 * 查询历史版本信息
	 */
	
	public List<AppVersion> selectAppVersion(@Param("appId")Integer appId);
	
	/**
	 * 新增版本信息
	 */
	public void addAppVersion(@Param("versionNo")String versionNo,@Param("appId")Integer appId,@Param("versionSize")BigDecimal versionSize,
			@Param("versionInfo")String versionInfo,@Param("apkFileName")String apkFileName);
	
	/**
	 * 更新app_info表版本id
	 */
	public void updateVersionId(@Param("id")Integer id,@Param("versionNo")String versionNo);
}
