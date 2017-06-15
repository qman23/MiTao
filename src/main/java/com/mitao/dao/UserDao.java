package com.mitao.dao;

import com.mitao.po.User;

public interface UserDao {

	public User selectUserByUserId(String userID);
	
	public User selectUserByPhone(String Phone);
}
