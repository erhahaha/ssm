package com.how2java.service;
import com.how2java.pojo.User;

public interface UserService {
	
	//用户注册
	void regist(User user);

	//用户登录
	//User login(String name, String password);
	
	//检验用户登录
	User checkLogin(String username,String password);
}
