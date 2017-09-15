package com.example.demo.dao;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.user.User;

@Repository
public interface UserDao extends PagingAndSortingRepository<User, Integer> {

}
