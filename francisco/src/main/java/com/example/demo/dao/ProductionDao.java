package com.example.demo.dao;

import java.util.Date;

import lombok.Data;

@Data
public class ProductionDao {

	private int id;
	private Date production_date;
	private int state;
	private int price;

	
}
