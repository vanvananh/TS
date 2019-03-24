package com.cmc.training.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.cmc.training.dto.PassportDTO;
import com.cmc.training.entity.Passport;


public interface PassportRepository extends JpaRepository<Passport, Integer>, JpaSpecificationExecutor<Passport>{
	
	@Query (value = "from Passport p where p.username like (%:username%)")
	public Passport getPassortByUsername(@Param ("username")String username);
	
	@Query (value = "from Passport p where p.username like (%:#{#passportDTO.username}%) and p.passportCode like (%:#{#passportDTO.passportCode}%) ")
	public List<Passport> getPassortByDto(@Param ("passportDTO")PassportDTO passportDTO);

}
