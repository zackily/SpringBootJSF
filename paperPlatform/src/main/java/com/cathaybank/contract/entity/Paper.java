package com.cathaybank.contract.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "paper")
public class Paper {
	@Id
	private String id;
	@Column
	private String buzzType;
	@Column
	private String paperName;
	@Column
	private Date startDate;
	@Column
	private Date endDate;
	@Column
	private String contractNo;
	@Column
	private String versionNo;
	@Column
	private String bookmark;
	@Column
	private String relatePaperNo;
	@Column
	private String relatePaperName;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getBuzzType() {
		return buzzType;
	}

	public void setBuzzType(String buzzType) {
		this.buzzType = buzzType;
	}

	public String getPaperName() {
		return paperName;
	}

	public void setPaperName(String paperName) {
		this.paperName = paperName;
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

	public String getContractNo() {
		return contractNo;
	}

	public void setContractNo(String contractNo) {
		this.contractNo = contractNo;
	}

	public String getVersionNo() {
		return versionNo;
	}

	public void setVersionNo(String versionNo) {
		this.versionNo = versionNo;
	}

	public String getBookmark() {
		return bookmark;
	}

	public void setBookmark(String bookmark) {
		this.bookmark = bookmark;
	}

	public String getRelatePaperNo() {
		return relatePaperNo;
	}

	public void setRelatePaperNo(String relatePaperNo) {
		this.relatePaperNo = relatePaperNo;
	}

	public String getRelatePaperName() {
		return relatePaperName;
	}

	public void setRelatePaperName(String relatePaperName) {
		this.relatePaperName = relatePaperName;
	}

}
