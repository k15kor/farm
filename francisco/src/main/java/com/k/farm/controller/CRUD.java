package com.k.farm.controller;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.k.farm.model.Chicken;

public interface CRUD<T, ID extends Serializable> {

	T create(T t);

	void delete(T t);

	void update(T t);

	List<T> getAll();

	//public Page<T> listAllByPage(Pageable pageable);
	
	T findById(ID id);

	Page<T> listAllByPage(Pageable pageable);
	

}
