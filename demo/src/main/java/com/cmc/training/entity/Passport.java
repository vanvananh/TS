package com.cmc.training.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "passport")
public class Passport implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "passport_id", unique = true, nullable = false)
	private Integer passportId;
	
	@Basic(optional = false)
	@Column(name = "passport_code", nullable = false)
	private String passportCode;
	
	@Basic(optional = false)
	@Column(name = "username", nullable = false)
	private String username;
	
	@Basic(optional = false)
	@Column(name = "status", nullable = false)
	private Integer status;
	
	@Basic(optional = false)
	@Column(name = "valid_time", nullable = false, length = 10, insertable = false, updatable = false)
	@Temporal(TemporalType.DATE)
	private Date validTime;
	
	@Basic(optional = false)
	@Column(name = "borrowse_time", nullable = true, length = 10, insertable = false, updatable = false)
	@Temporal(TemporalType.DATE)
	private Date borrowseTime;
	
	@Basic(optional = false)
	@Column(name = "return_time", nullable = true, length = 10, insertable = false, updatable = false)
	@Temporal(TemporalType.DATE)
	private Date returnTime;
	
	@Basic(optional = false)
	@Column(name = "borrowse_actual", nullable = true, length = 10, insertable = false, updatable = false)
	@Temporal(TemporalType.DATE)
	private Date borrowseActual;
	
	@Basic(optional = false)
	@Column(name = "return_actual", nullable = true, length = 10, insertable = false, updatable = false)
	@Temporal(TemporalType.DATE)
	private Date returnActual;
	
	@Basic(optional = false)
	@Column(name = "image", nullable = true)
	private Long image;

	public Integer getPassportId() {
		return passportId;
	}

	public void setPassportId(Integer passportId) {
		this.passportId = passportId;
	}

	public String getPassportCode() {
		return passportCode;
	}

	public void setPassportCode(String passportCode) {
		this.passportCode = passportCode;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Date getValidTime() {
		return validTime;
	}

	public void setValidTime(Date validTime) {
		this.validTime = validTime;
	}

	public Date getBorrowseTime() {
		return borrowseTime;
	}

	public void setBorrowseTime(Date borrowseTime) {
		this.borrowseTime = borrowseTime;
	}

	public Date getReturnTime() {
		return returnTime;
	}

	public void setReturnTime(Date returnTime) {
		this.returnTime = returnTime;
	}

	public Date getBorrowseActual() {
		return borrowseActual;
	}

	public void setBorrowseActual(Date borrowseActual) {
		this.borrowseActual = borrowseActual;
	}

	public Date getReturnActual() {
		return returnActual;
	}

	public void setReturnActual(Date returnActual) {
		this.returnActual = returnActual;
	}

	public Long getImage() {
		return image;
	}

	public void setImage(Long image) {
		this.image = image;
	}
	
	
	
}
