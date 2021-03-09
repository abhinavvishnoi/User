package com.infosys.user.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.infosys.user.dto.LoginDTO;
import com.infosys.user.dto.SellerDTO;
import com.infosys.user.service.SellerService;

@RestController
@CrossOrigin
public class SellerController {

	Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	SellerService sellerService;
	
	@PostMapping(value = "/customers",  consumes = MediaType.APPLICATION_JSON_VALUE)
	public void createCustomer(@RequestBody SellerDTO sellDTO) {
		logger.info("Creation request for customer {}", sellDTO);
		sellerService.createSeller(sellDTO);
	}
	
	@PostMapping(value = "/login",consumes = MediaType.APPLICATION_JSON_VALUE)
	public boolean login(@RequestBody LoginDTO loginDTO) {
		logger.info("Login request for customer {} with password {}", loginDTO.getPhoneNumber(),loginDTO.getPassword());
		return sellerService.login(loginDTO);
	}
}
