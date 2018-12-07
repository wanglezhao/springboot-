package com.guweibit.springBootDemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.guweibit.springBootDemo.entity.User;
import com.guweibit.springBootDemo.service.UserService;

@RestController
public class JDBCTestController {
	 @Autowired
	 UserService userService;

	    @GetMapping("show")
	    public List<User> getUser(){
	        return userService.getUser();
	    }
	
}
