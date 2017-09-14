package com.paloma.farm.model;

import java.util.List;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;


@Data
@Entity
@Table(name = "chicken")
public class Chicken implements Serializable {

	private static final long serialVersionUID = 9108825445592569217L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer idChicken;

	private String type;

	@ManyToOne
	private User idUser;
	
	
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "idProduction")
	private List<Production> productions;

	private String frecuency;

}
