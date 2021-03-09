package com.infosys.user.entity;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Cart {

	@EmbeddedId
	private MyKeyy myKeyy;
	@Column(name="quantity", nullable=false)
	Integer quantity;
	
	public MyKeyy getMyKeyy() {
		return myKeyy;
	}
	public void setMyKeyy(MyKeyy myKeyy) {
		this.myKeyy=myKeyy;
	}
	
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity=quantity;
	}
}
