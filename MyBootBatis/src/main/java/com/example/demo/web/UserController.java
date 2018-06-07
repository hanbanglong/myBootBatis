package com.example.demo.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;
import com.example.demo.service.UserService;

@RestController
//@RequestMapping("restful/user")
public class UserController {

	@Autowired
	private UserService userservice;
	
	@RequestMapping(value="/hello",method=RequestMethod.GET)
    public List<User> index() {
		List<User> users=userservice.getUsers();
		return users;
	}
}
