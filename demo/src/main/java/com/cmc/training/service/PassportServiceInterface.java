package com.cmc.training.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.cmc.training.dto.PassportDTO;
import com.cmc.training.entity.Passport;
import com.cmc.training.util.Paging;
import com.cmc.training.util.Sorting;
import com.cmc.training.util.filter.FilterPassport;



public interface PassportServiceInterface {
	
	public boolean isExist(Integer id);
	
	public PassportDTO getById(Integer id);
	
	public Passport createPassport(Passport passport);
	
	public Passport updatePassort(Passport passport);
	
	public List<Passport> getPassportByDto(PassportDTO dto);
	
	public Passport getPassportByUsername(String username);
	
	public Page<Passport> getAllPassport(Paging paging, Sorting sorting, String keywordSearch,
		      FilterPassport filter);

}
