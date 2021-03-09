package com.infosys.user.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infosys.user.dto.LoginDTO;
import com.infosys.user.dto.SellerDTO;
import com.infosys.user.entity.Seller;
import com.infosys.user.repository.SellerRepository;

@Service
public class SellerService {

	Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	SellerRepository sellRepo;
	
	public void createSeller(SellerDTO sellDTO) {
		
	}
	
	public boolean login(LoginDTO loginDTO) {
		return false;
	}
}
