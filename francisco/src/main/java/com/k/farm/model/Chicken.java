package com.k.farm.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.Data;

//@Data
@Entity
public class Chicken implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	private String type;

	//aqui debe ir una relacion
	//private Integer id_user;
	
	private String frecuency;
	
	@ManyToOne
	private User user;
	
	
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "chicken")
	private List<Production> production;


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public String getFrecuency() {
		return frecuency;
	}


	public void setFrecuency(String frecuency) {
		this.frecuency = frecuency;
	}


	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}


	public List<Production> getProduction() {
		return production;
	}


	public void setProduction(List<Production> production) {
		this.production = production;
	}

}
