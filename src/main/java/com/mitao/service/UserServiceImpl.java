package com.mitao.service;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.mitao.dao.UserMapper;
import com.mitao.po.User;

@Service("userServiceImpl")
public class UserServiceImpl implements IUserService{

	@Resource
	private UserMapper userMapper;

	@Override
	public User selectUserById(String userID) {
		return userMapper.selectUserById(userID);
	}
	
}
