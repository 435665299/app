package com.by.entity;

import java.io.Serializable;

import java.math.BigDecimal;
import java.util.Date;
import java.math.BigInteger;


/**
 * The persistent class for the app_info database table.
 * 
 */

public class AppInfo implements Serializable {
	private static final long serialVersionUID = 1L;


	private String id;

	private String APKName;

	private String appInfo;

	private BigInteger categoryLevel1;

	private BigInteger categoryLevel2;

	private BigInteger categoryLevel3;

	private BigInteger createdBy;


	private Date creationDate;

	private BigInteger devId;

	private BigInteger downloads;

	private BigInteger flatformId;

	private String interfaceLanguage;

	private String logoLocPath;

	private String logoPicPath;

	private BigInteger modifyBy;


	private Date modifyDate;


	private Date offSaleDate;


	private Date onSaleDate;

	private String softwareName;

	private BigDecimal softwareSize;

	private BigInteger status;

	private String supportROM;


	private Date updateDate;

	private BigInteger versionId;

	public AppInfo() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAPKName() {
		return this.APKName;
	}

	public void setAPKName(String APKName) {
		this.APKName = APKName;
	}

	public String getAppInfo() {
		return this.appInfo;
	}

	public void setAppInfo(String appInfo) {
		this.appInfo = appInfo;
	}

	public BigInteger getCategoryLevel1() {
		return this.categoryLevel1;
	}

	public void setCategoryLevel1(BigInteger categoryLevel1) {
		this.categoryLevel1 = categoryLevel1;
	}

	public BigInteger getCategoryLevel2() {
		return this.categoryLevel2;
	}

	public void setCategoryLevel2(BigInteger categoryLevel2) {
		this.categoryLevel2 = categoryLevel2;
	}

	public BigInteger getCategoryLevel3() {
		return this.categoryLevel3;
	}

	public void setCategoryLevel3(BigInteger categoryLevel3) {
		this.categoryLevel3 = categoryLevel3;
	}

	public BigInteger getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(BigInteger createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreationDate() {
		return this.creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public BigInteger getDevId() {
		return this.devId;
	}

	public void setDevId(BigInteger devId) {
		this.devId = devId;
	}

	public BigInteger getDownloads() {
		return this.downloads;
	}

	public void setDownloads(BigInteger downloads) {
		this.downloads = downloads;
	}

	public BigInteger getFlatformId() {
		return this.flatformId;
	}

	public void setFlatformId(BigInteger flatformId) {
		this.flatformId = flatformId;
	}

	public String getInterfaceLanguage() {
		return this.interfaceLanguage;
	}

	public void setInterfaceLanguage(String interfaceLanguage) {
		this.interfaceLanguage = interfaceLanguage;
	}

	public String getLogoLocPath() {
		return this.logoLocPath;
	}

	public void setLogoLocPath(String logoLocPath) {
		this.logoLocPath = logoLocPath;
	}

	public String getLogoPicPath() {
		return this.logoPicPath;
	}

	public void setLogoPicPath(String logoPicPath) {
		this.logoPicPath = logoPicPath;
	}

	public BigInteger getModifyBy() {
		return this.modifyBy;
	}

	public void setModifyBy(BigInteger modifyBy) {
		this.modifyBy = modifyBy;
	}

	public Date getModifyDate() {
		return this.modifyDate;
	}

	public void setModifyDate(Date modifyDate) {
		this.modifyDate = modifyDate;
	}

	public Date getOffSaleDate() {
		return this.offSaleDate;
	}

	public void setOffSaleDate(Date offSaleDate) {
		this.offSaleDate = offSaleDate;
	}

	public Date getOnSaleDate() {
		return this.onSaleDate;
	}

	public void setOnSaleDate(Date onSaleDate) {
		this.onSaleDate = onSaleDate;
	}

	public String getSoftwareName() {
		return this.softwareName;
	}

	public void setSoftwareName(String softwareName) {
		this.softwareName = softwareName;
	}

	public BigDecimal getSoftwareSize() {
		return this.softwareSize;
	}

	public void setSoftwareSize(BigDecimal softwareSize) {
		this.softwareSize = softwareSize;
	}

	public BigInteger getStatus() {
		return this.status;
	}

	public void setStatus(BigInteger status) {
		this.status = status;
	}

	public String getSupportROM() {
		return this.supportROM;
	}

	public void setSupportROM(String supportROM) {
		this.supportROM = supportROM;
	}

	public Date getUpdateDate() {
		return this.updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public BigInteger getVersionId() {
		return this.versionId;
	}

	public void setVersionId(BigInteger versionId) {
		this.versionId = versionId;
	}

}