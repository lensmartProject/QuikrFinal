package com.example.demo.dao;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.model.User;



public interface UserRepository extends MongoRepository<User, Integer>{
	
	

}