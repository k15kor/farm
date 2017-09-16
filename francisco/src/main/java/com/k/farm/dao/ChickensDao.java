package com.k.farm.dao;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.k.farm.model.user.User;

import lombok.Data;

@Data  
@Entity
public interface ChickensDao extends PagingAndSortingRepository<User, Integer> {

	
	
}
