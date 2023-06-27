package com.pavanks.CRUD.CRUD;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table(name="lappy")
public class laptop {
	@Id 
	@Column(name="ID")
int l_id;
	@Column(name="BRAND")
String l_brand;
	@Column(name="PRICE")
int price;
	public laptop() {
		super();
		// TODO Auto-generated constructor stub
	}
	public laptop(int l_id, String l_brand, int price) {
		super();
		this.l_id = l_id;
		this.l_brand = l_brand;
		this.price = price;
	}
	public int getL_id() {
		return l_id;
	}
	public void setL_id(int l_id) {
		this.l_id = l_id;
	}
	public String getL_brand() {
		return l_brand;
	}
	public void setL_brand(String l_brand) {
		this.l_brand = l_brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "laptop [l_id=" + l_id + ", l_brand=" + l_brand + ", price=" + price + "]";
	}
	

}
