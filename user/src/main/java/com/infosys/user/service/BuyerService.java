package com.infosys.user.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infosys.user.dto.BuyerDTO;
import com.infosys.user.dto.LoginDTO;
import com.infosys.user.entity.Buyer;
import com.infosys.user.repository.BuyerRepository;

@Service
public class BuyerService {

	Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	BuyerRepository buyerRepo;
	
	public void createBuyer(BuyerDTO buyDTO) {
		
		
	}
	
	public boolean login(LoginDTO loginDTO) {
		return false;
	}
}
