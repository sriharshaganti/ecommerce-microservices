package com.microecom.userservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microecom.userservice.domain.User;
import com.microecom.userservice.repository.UserRepository;

import io.swagger.annotations.Api;

@RestController
@RequestMapping("/rest/users")
@Api(value="User Services", description="Get all the endpoints of User resource")
public class UserResource {
	
	@Autowired
	private UserRepository userRepository;
	
	
	@GetMapping(value = "/all", produces = "application/json")
	public List<User> getAllUsers(){
		
		return userRepository.findAll();
	}
	
	@GetMapping(value = "/{emailAddress}/user", produces = "application/json")
	public List<User> getUserDetailsByEmail(@PathVariable String emailAddress){
		
		return userRepository.findByEmailAddress(emailAddress);	
	}
 
}
