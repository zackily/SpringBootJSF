package com.cathaybank.contract.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "contract")
public class Contract {
	@Id
	private String id;
	@Column
	private String boundry;
	@Column
	private String agent;
	@Column
	private String fundation;
	@Column
	private String series;
	@Column
	private Date startDate;
	@Column
	private Date endDate;
	@Column
	private String masterType;
	@Column
	private String detailType;
	@Column
	private String tips;
	@Column
	private String paperNo;
	@Column
	private String endReason;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getBoundry() {
		return boundry;
	}

	public void setBoundry(String boundry) {
		this.boundry = boundry;
	}

	public String getAgent() {
		return agent;
	}

	public void setAgent(String agent) {
		this.agent = agent;
	}

	public String getFundation() {
		return fundation;
	}

	public void setFundation(String fundation) {
		this.fundation = fundation;
	}

	public String getSeries() {
		return series;
	}

	public void setSeries(String series) {
		this.series = series;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getMasterType() {
		return masterType;
	}

	public void setMasterType(String masterType) {
		this.masterType = masterType;
	}

	public String getDetailType() {
		return detailType;
	}

	public void setDetailType(String detailType) {
		this.detailType = detailType;
	}

	public String getTips() {
		return tips;
	}

	public void setTips(String tips) {
		this.tips = tips;
	}

	public String getPaperNo() {
		return paperNo;
	}

	public void setPaperNo(String paperNo) {
		this.paperNo = paperNo;
	}

	public String getEndReason() {
		return endReason;
	}

	public void setEndReason(String endReason) {
		this.endReason = endReason;
	}

}
