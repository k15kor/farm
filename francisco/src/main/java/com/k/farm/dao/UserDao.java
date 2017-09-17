package com.k.farm.dao;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.k.farm.model.User;

import lombok.Data;

@Data
@Repository
public interface UserDao extends PagingAndSortingRepository<User, Integer> {
	
	
	
	
}
