package com.how2java.service;
import com.how2java.pojo.User;

public interface UserService {
	
	//�û�ע��
	void regist(User user);

	//�û���¼
	//User login(String name, String password);
	
	//�����û���¼
	User checkLogin(String username,String password);
}
