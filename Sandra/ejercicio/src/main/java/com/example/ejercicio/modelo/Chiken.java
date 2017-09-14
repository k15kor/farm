package com.example.ejercicio.modelo;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;


@Data
@Entity
public class Chiken {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id_chiken;
	
	private String type;
	
	private String frecuency;
	
	@ManyToOne
	private User user;
	
	private List<Production> production;
	

}
