package com.infosys.user.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.infosys.user.dto.BuyerDTO;
import com.infosys.user.dto.LoginDTO;
import com.infosys.user.service.BuyerService;

@RestController
@CrossOrigin
public class BuyerController {

	Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	BuyerService buyerService;
	
	@PostMapping(value = "/users",  consumes = MediaType.APPLICATION_JSON_VALUE)
	public void createCustomer(@RequestBody BuyerDTO buyDTO) {
		logger.info("Creation request for customer {}", buyDTO);
		buyerService.createBuyer(buyDTO);
	}
	
	@PostMapping(value = "/login",consumes = MediaType.APPLICATION_JSON_VALUE)
	public boolean login(@RequestBody LoginDTO loginDTO) {
		logger.info("Login request for customer {} with password {}", loginDTO.getPhoneNumber(),loginDTO.getPassword());
		return buyerService.login(loginDTO);
	}
	
}
