package com.infosys.user.dto;

import com.infosys.user.entity.Wishlist;

public class WishlistDTO {

	Integer buyerId;
	Integer prodId;
	
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
	
	public static WishlistDTO valueOf(Wishlist wish) {
		WishlistDTO wishlistDTO = new WishlistDTO();
		wishlistDTO.setBuyerId(wish.getMyKey().getBuyerId());
		wishlistDTO.setProdId(wish.getMyKey().getProdId());
		
		return wishlistDTO;
	}
}
