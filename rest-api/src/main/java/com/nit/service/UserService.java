package com.nit.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.nit.api.model.User;

@Service
public class UserService {
	
	private List<User> userList;
	
	public UserService() {
		userList=new ArrayList<>();
		User user1=new User(1,"Nithin1",20,"n1@gmail.com");
		User user2=new User(2,"Nithin2",20,"n12@gmail.com");
		User user3=new User(3,"Nithin3",20,"n123@gmail.com");
		User user4=new User(4,"Nithin4",20,"n1234@gmail.com");
		User user5=new User(5,"Nithin4",20,"n1235@gmail.com");
		
		//Addinh all objects values into collection
		userList.addAll(Arrays.asList(user1,user2,user3,user4,user5));
		
	}

	public Optional<User>  getUser(Integer id) {
		Optional optional=Optional.empty();
		for(User user:userList) {
			if(id==user.getId()) {
				optional=Optional.of(user);
				return optional;
			}
		}
		
		
		
		return optional;
	}

}
