package com.aliouswang.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.aliouswang.model.User;
import com.aliouswang.service.UserService;
import com.aliouswang.service.UserServiceImpl;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/userList")
	public @ResponseBody List<User> getUserList() {
		return userService.findAllUsers();
	}
	

}
