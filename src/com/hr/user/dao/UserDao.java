package com.hr.user.dao;

import java.util.List;

public interface UserDao<T> {
	public List<T> QueryAll();
	public T QueryByName(String name);
}
