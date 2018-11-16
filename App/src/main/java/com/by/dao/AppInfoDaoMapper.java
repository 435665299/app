package com.by.dao;

import java.math.BigInteger;
import java.util.List;
import java.util.Map;
import java.math.BigDecimal;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.type.IntegerTypeHandler;
import org.springframework.web.bind.annotation.PatchMapping;

import com.by.entity.AppInfo;

public interface AppInfoDaoMapper {
	
	/**
	 * ����������ѯapp�б�
	 * @param softwareName
	 * @param appStatus
	 * @param appFlatForm
	 * @param categoryLevel1
	 * @param categoryLevel2
	 * @param categoryLevel3
	 * @return
	 */
	public List<AppInfo> selectAppInfo(@Param("softwareName")String softwareName,
			@Param("status") Integer appStatus,@Param("flatformId") Integer appFlatForm,
			@Param("categoryLevel1") Integer categoryLevel1,@Param("categoryLevel2") Integer categoryLevel2,
			@Param("categoryLevel3") Integer categoryLevel3);
	
	/**
	 * ����id����appInfo
	 * @param id
	 * @return
	 */
	public AppInfo selectAppInfoById(@Param("id") Integer id);
	
	/**
	 * ɾ��app
	 */
	public boolean deleteAppInfo(@Param("id")Integer id);
	
	/**
	 * �޸�App��Ϣ
	 */
	public boolean updateAppInfo(@Param("id")Integer id,@Param("softwareName")String softwareName,@Param("supportROM")String supportROM,
			@Param("interfaceLanguage")String interfaceLanguage,@Param("softwareSize")BigDecimal softwareSize,
			@Param("downloads")Integer downloads,@Param("flatformId")Integer flatformId,
			@Param("categoryLevel1")Integer categoryLevel1,@Param("categoryLevel2")Integer categoryLevel2,
			@Param("categoryLevel3")Integer categoryLevel3,@Param("appInfo")String appInfo);
	
	/**
	 * �޸�App���״̬
	 */
	
	public boolean updateStatus(@Param("id")Integer id,@Param("status") Integer status);
}
