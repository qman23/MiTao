package com.mitao.service;

import com.mitao.po.User;

public interface IUserService {

	User selectUserByUserId(String userID);
}
