package com.infosys.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.infosys.user.entity.Seller;

@Repository
public interface SellerRepository extends JpaRepository<Seller, >{

}
