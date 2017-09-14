package com.paloma.farm.model;

import java.util.List;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
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
@Table(name = "user")
public class User implements Serializable {

	private static final long serialVersionUID = 4324472415853055382L;

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer idUser;
	
	@Column(nullable=false)
	private String username;
	
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "idChicken")
	private List<Chicken> chickens;


}