package com.infosys.user.dto;

import com.infosys.user.entity.Cart;

public class CartDTO {

	Integer buyerId;
	Integer prodId;
	Integer quantity;
	
	public Integer getBuyerId() {
		return buyerId;
	}
	public void setBuyerId(Integer buyerId) {
		this.buyerId=buyerId;
	}
	
	public Integer getProdId() {
		return prodId;
	}
	public void setProdId(Integer prodId) {
		this.prodId=prodId;
	}
	
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity=quantity;
	}
	
	public static CartDTO valueOf(Cart cartt) {
		CartDTO cartDTO = new CartDTO();
		cartDTO.setBuyerId(cartt.getMyKeyy().getBuyerId());
		cartDTO.setProdId(cartt.getMyKeyy().getProdId());
		cartDTO.setQuantity(cartt.getQuantity());
		
		return cartDTO;
	}
}
