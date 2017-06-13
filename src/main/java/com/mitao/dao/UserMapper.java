package com.mitao.dao;

import com.mitao.po.User;

public interface UserMapper {

	public User selectUserById(Integer userID);
}
