package com.how2java.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.how2java.mapper.UserMapper;
import com.how2java.pojo.User;
import com.how2java.service.UserService;

@Service
public class UserServiceIpml implements UserService{

	@Autowired	
	private UserMapper userMapper;
	
	@Override	
	public void regist(User user) 
	{		
		userMapper.addUser(user);	
	} 	
	
	@Override	
	public User checkLogin(String name, String password) {
		
		User user = userMapper.findByUsername(name);
		if(user != null && user.getPassword().equals(password)){
		
			return user;
		}
		return null;
	}
		
}
