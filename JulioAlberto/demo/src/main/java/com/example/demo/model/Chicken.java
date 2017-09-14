package com.example.demo.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Chickens {


	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id_chicken;

	private String type;
	
	private String frecuency;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "idProduction")
	private List<Production> production;
}
