package com.hr.user.service.impl;

import com.hr.user.dao.impl.UserDaoImpl;
import com.hr.user.domain.User;
import com.hr.user.service.UserService;

public class UserServiceImpl implements UserService {
	UserDaoImpl userDaoImpl = new UserDaoImpl();

	public User findUserByName(String name) {
		// TODO Auto-generated method stub
		return userDaoImpl.QueryByName(name);
	}

	public boolean loginUser(String name, String passwd) {
		// TODO Auto-generated method stub
		User user = userDaoImpl.QueryByName(name);
		if(user!=null){
			if(user.getPassword().equals(passwd)){
				return true;
			}else {
				return false;
			}
		} else {
			return false;
		}
	}
}
