package com.cmc.training.dto;

import java.util.Date;

import com.cmc.training.entity.Passport;



public class PassportDTO {
	private String passportCode;
	private String username;
	private Integer status;
	private Date validDate;
	private Date borrowseDate;
	private Date returnDate;
	private Date borrowseActual;
	private Date returnActual;
	private Long image;
	
	
	
	public PassportDTO(Passport passport) {
		this.passportCode = passport.getPassportCode();
		this.username = passport.getUsername();
		this.status = passport.getStatus();
		this.validDate = passport.getValidTime();
		this.borrowseDate  = passport.getBorrowseTime();
		this.returnDate = passport.getReturnTime();
		this.borrowseActual = passport.getBorrowseActual();
		this.returnActual = passport.getReturnActual();
		this.image = passport.getImage();
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
	public Date getValidDate() {
		return validDate;
	}
	public void setValidDate(Date validDate) {
		this.validDate = validDate;
	}
	public Date getBorrowseDate() {
		return borrowseDate;
	}
	public void setBorrowseDate(Date borrowseDate) {
		this.borrowseDate = borrowseDate;
	}
	public Date getReturnDate() {
		return returnDate;
	}
	public void setReturnDate(Date returnDate) {
		this.returnDate = returnDate;
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
