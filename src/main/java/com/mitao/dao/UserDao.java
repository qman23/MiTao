package com.mitao.dao;

import com.mitao.po.User;

public interface UserDao {

	public User selectUserById(String userID);
}
