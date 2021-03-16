package com.infosys.project.User.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infosys.project.User.entity.Buyer;


public interface BuyerRepository extends JpaRepository<Buyer, Integer>{
	
	public Optional<Buyer> findByPhoneNumber(Long phoneNumber);

}
