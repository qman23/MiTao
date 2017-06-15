package com.mitao.service;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.mitao.dao.UserDao;
import com.mitao.po.User;

@Service("userServiceImpl")
public class UserServiceImpl implements IUserService{

	@Resource
	private UserDao userMapper;

	@Override
	public User selectUserByUserId(String userID) {
		return userMapper.selectUserByUserId(userID);
	}
	
}
