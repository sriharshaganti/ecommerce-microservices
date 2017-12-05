package com.microecom.userservice.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.microecom.userservice.domain.User;

public interface UserRepository extends MongoRepository<User, String> {
	
	List<User> findByUserName(String userName);
	List<User> findByEmailAddress(String emailAddress);
	
	List<User> findAll();

}
