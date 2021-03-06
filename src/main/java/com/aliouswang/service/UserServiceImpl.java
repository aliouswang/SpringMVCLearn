package com.aliouswang.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aliouswang.dao.UserDao;
import com.aliouswang.dao.UserDaoImpl;
import com.aliouswang.model.User;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	UserDao userDao;
	
	public List<User> findAllUsers() {
		return userDao.findALLDepts();
	}

}
