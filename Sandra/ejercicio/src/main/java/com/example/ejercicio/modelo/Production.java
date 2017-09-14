package com.example.ejercicio.modelo;

import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;


@Data
public class Production {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id_production;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date production_date;
	
	public int state;
	
	public int price;
	
	@ManyToOne
	private Chiken chiken;
}
