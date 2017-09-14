package com.paloma.farm.model;

import java.util.Date;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Table;


import lombok.Data;


@Data
@Entity
@Table(name = "production")
public class Production implements Serializable {

	private static final long serialVersionUID = 1786920272455080095L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer idProduction;

	@Temporal(TemporalType.TIMESTAMP)
	private Date productionDate;
	
	private Boolean state;

	private Integer price;
	
	@ManyToOne
	private Chicken chicken;
}
