package com.cmc.training.dto;

import java.util.Date;

public class HotelSearchDTO {
	
	private Integer wardId;
	
	private Date startDate;
	
	private Date endDate;
	
	private Integer typeOfRoomId;
	
	

	public HotelSearchDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public HotelSearchDTO(Integer wardId, Date startDate, Date endDate, Integer typeOfRoomId) {
		super();
		this.wardId = wardId;
		this.startDate = startDate;
		this.endDate = endDate;
		this.typeOfRoomId = typeOfRoomId;
	}

	public Integer getWardId() {
		return wardId;
	}

	public void setWardId(Integer wardId) {
		this.wardId = wardId;
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

	public Integer getTypeOfRoomId() {
		return typeOfRoomId;
	}

	public void setTypeOfRoomId(Integer typeOfRoomId) {
		this.typeOfRoomId = typeOfRoomId;
	}
	
	

}
