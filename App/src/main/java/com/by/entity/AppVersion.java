package com.by.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.math.BigInteger;


/**
 * The persistent class for the app_version database table.
 * 
 */

public class AppVersion implements Serializable {
	private static final long serialVersionUID = 1L;


	private String id;

	private String apkFileName;

	private String apkLocPath;

	private BigInteger appId;

	private BigInteger createdBy;


	private Date creationDate;

	private String downloadLink;

	private BigInteger modifyBy;


	private Date modifyDate;

	private BigInteger publishStatus;

	private String versionInfo;

	private String versionNo;

	private BigDecimal versionSize;

	public AppVersion() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getApkFileName() {
		return this.apkFileName;
	}

	public void setApkFileName(String apkFileName) {
		this.apkFileName = apkFileName;
	}

	public String getApkLocPath() {
		return this.apkLocPath;
	}

	public void setApkLocPath(String apkLocPath) {
		this.apkLocPath = apkLocPath;
	}

	public BigInteger getAppId() {
		return this.appId;
	}

	public void setAppId(BigInteger appId) {
		this.appId = appId;
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

	public String getDownloadLink() {
		return this.downloadLink;
	}

	public void setDownloadLink(String downloadLink) {
		this.downloadLink = downloadLink;
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

	public BigInteger getPublishStatus() {
		return this.publishStatus;
	}

	public void setPublishStatus(BigInteger publishStatus) {
		this.publishStatus = publishStatus;
	}

	public String getVersionInfo() {
		return this.versionInfo;
	}

	public void setVersionInfo(String versionInfo) {
		this.versionInfo = versionInfo;
	}

	public String getVersionNo() {
		return this.versionNo;
	}

	public void setVersionNo(String versionNo) {
		this.versionNo = versionNo;
	}

	public BigDecimal getVersionSize() {
		return this.versionSize;
	}

	public void setVersionSize(BigDecimal versionSize) {
		this.versionSize = versionSize;
	}

}