package com.k.farm.dao;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.k.farm.model.Chicken;

import lombok.Data;

@Data  
@Repository
public interface ChickenDao extends PagingAndSortingRepository<Chicken, Integer> {

	
	
}
