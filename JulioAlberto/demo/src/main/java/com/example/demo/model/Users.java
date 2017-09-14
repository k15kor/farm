package com.example.demo.model;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;

@Data
@Entity
public class Users {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id_user;

	private String name;


	@OneToMany(fetch = FetchType.LAZY, mappedBy = "idChicken")
	private List<Chickens> chickens;

}
