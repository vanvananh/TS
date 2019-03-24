package com.cmc.training.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.cmc.training.dto.PassportDTO;
import com.cmc.training.entity.Account;
import com.cmc.training.entity.Passport;
import com.cmc.training.repository.PassportRepository;
import com.cmc.training.util.Constants;
import com.cmc.training.util.MethodUtil;
import com.cmc.training.util.Paging;
import com.cmc.training.util.Sorting;
import com.cmc.training.util.Constants.Operation;
import com.cmc.training.util.filter.FilterAccount;
import com.cmc.training.util.filter.FilterPassport;
import com.cmc.training.util.specification.CriteriaCustom;
import com.cmc.training.util.specification.SpecificationBuilder;




@Service
public class PassportServiceImpl implements PassportServiceInterface{
	
	@Autowired
	private PassportRepository passportRepository;

	@Override
	public boolean isExist(Integer id) {
		// TODO Auto-generated method stub
		return passportRepository.exists(id);
	}

	@Override
	public PassportDTO getById(Integer id) {
		// TODO Auto-generated method stub
		return new PassportDTO(passportRepository.findOne(id));
	}

	@Override
	public Passport createPassport(Passport passport) {
		// TODO Auto-generated method stub
		Passport p = passportRepository.save(passport);
		return passportRepository.findOne(p.getPassportId());
	}

	@Override
	public Passport updatePassort(Passport passport) {
		// TODO Auto-generated method stub
		
		return null;
	}

	@Override
	public List<Passport> getPassportByDto(PassportDTO dto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Passport getPassportByUsername(String username) {
		// TODO Auto-generated method stub
		return passportRepository.getPassortByUsername(username);
	}
	
	  @Override
	  public Page<Passport> getAllPassport(Paging paging, Sorting sorting, String keywordSearch,
	      FilterPassport filter) {

	    SpecificationBuilder<Passport> specification = new SpecificationBuilder<Passport>();

	    // search
	    if (!MethodUtil.isNull(keywordSearch)) {
	      specification.addCriteriaCustom(new CriteriaCustom(Constants.NameColume.FULL_NAME_SEARCH,
	          Constants.Operation.LIKE, keywordSearch));
	    }

	    // filter
	    if (!MethodUtil.isNull(filter)) {

	    }

	    // convert sorting field search
	    sorting.convertSort(Constants.NameColume.FULL_NAME, Constants.NameColume.FULL_NAME_SEARCH);
	    sorting.convertSort(Constants.NameColume.DEPARTMENT_NAME,
	        Constants.NameColume.DEPARTMENT_NAME_SEARCH);
	    sorting.convertSort(Constants.NameColume.POSITION_NAME,
	        Constants.NameColume.POSITION_NAME_SEARCH);
	    // query extra sort field accountId
	    sorting.and(Direction.ASC, Constants.NameColume.ACCOUNT_ID);

	    // query with paging
	    if (!MethodUtil.isNull(paging)) {
	      return passportRepository.findAll(specification.build(),
	          MethodUtil.Pagination(paging, sorting));
	    }
	    // else query not paging
	    return new PageImpl<Passport>(
	        passportRepository.findAll(specification.build(), MethodUtil.convertSort(sorting)));
	  }

}
