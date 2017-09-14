package com.example.demo.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.Data;

@Data
@Entity
public class Production {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id_production;

	private byte state;

	@Temporal(TemporalType.TIMESTAMP)
	private Date production_date;

	private Integer price;

}