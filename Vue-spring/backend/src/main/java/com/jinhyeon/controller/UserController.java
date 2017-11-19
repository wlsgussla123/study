package com.jinhyeon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.jinhyeon.domain.User;
import com.jinhyeon.service.UserService;

@RestController
public class UserController {
	@Autowired
	private UserService userService;
	
	@RequestMapping("/")
	public String helloWorld() {
		return "Hello world!";
	}
	
	@RequestMapping(path = "/{id}", method = RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK)
	public User getUser(@PathVariable int id) {
		User user = this.userService.getUser(id);
		System.out.println(user.getId());
		System.out.println(user.getUserName());
		
		return user;
	}

//	@RequestMapping(path = "/{id}", method = RequestMethod.GET)
//	public User getUser(@PathVariable int id) {
//		User user = new User("박진현");
//		user.setId(2);
//		
//		return user;
//	}
}
