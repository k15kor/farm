package com.example.demo.dao;

import java.util.Date;

public class ProductionDao {

	private int id;
	private Date production_date;
	private int state;
	private int price;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getProduction_date() {
		return production_date;
	}
	public void setProduction_date(Date production_date) {
		this.production_date = production_date;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
}
