package com.nit.api.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nit.api.model.User;
import com.nit.service.UserService;

@RestController
public class UserController {
	
	private UserService userService;
	
	@Autowired
	public UserController(UserService userService) {
		this.userService=userService;
	}
	
	@GetMapping("/user")
	public User getUser(@RequestParam Integer id) {
		Optional user=userService.getUser(id);
		if(user.isPresent()) {
			return (User) user.get();
		}
		return null;

	}
	

	
	
}
