package com.dukang.tushu.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dukang.tushu.dao.UserDao;
import com.dukang.tushu.domain.User;
import com.dukang.tushu.service.IUserService;

@Service("userService")
public class UserServiceImpl implements IUserService {
	
	@Resource
	private UserDao UserDao;

	
	@Override
	public User selectUserById(Integer id) {
		
		return UserDao.selectUserById(id);
		
	}

}
