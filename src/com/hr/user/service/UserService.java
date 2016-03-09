package com.hr.user.service;

import com.hr.user.domain.User;

public interface UserService {
	public User findUserByName(String name);
	
	public boolean loginUser(String name,String passwd);
}
