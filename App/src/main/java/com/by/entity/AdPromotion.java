package com.by.entity;

import java.io.Serializable;
import java.util.Date;
import java.math.BigInteger;


/**
 * The persistent class for the ad_promotion database table.
 * 
 */

public class AdPromotion implements Serializable {
	private static final long serialVersionUID = 1L;


	private String id;

	private String adPicPath;

	private BigInteger adPV;

	private BigInteger appId;

	private int carouselPosition;

	private BigInteger createdBy;


	private Date creationDate;


	private Date endTime;

	private BigInteger modifyBy;


	private Date modifyDate;


	private Date startTime;

	public AdPromotion() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAdPicPath() {
		return this.adPicPath;
	}

	public void setAdPicPath(String adPicPath) {
		this.adPicPath = adPicPath;
	}

	public BigInteger getAdPV() {
		return this.adPV;
	}

	public void setAdPV(BigInteger adPV) {
		this.adPV = adPV;
	}

	public BigInteger getAppId() {
		return this.appId;
	}

	public void setAppId(BigInteger appId) {
		this.appId = appId;
	}

	public int getCarouselPosition() {
		return this.carouselPosition;
	}

	public void setCarouselPosition(int carouselPosition) {
		this.carouselPosition = carouselPosition;
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

	public Date getEndTime() {
		return this.endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
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

	public Date getStartTime() {
		return this.startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

}