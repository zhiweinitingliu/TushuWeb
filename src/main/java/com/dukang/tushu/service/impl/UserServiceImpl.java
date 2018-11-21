package com.dukang.tushu.service.impl;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dukang.tushu.dao.UserDao;
import com.dukang.tushu.domain.User;
import com.dukang.tushu.service.IUserService;
import com.dukang.tushu.service.utils.JwtToken;

@Service("userService")
public class UserServiceImpl implements IUserService {
	
	@Resource
	private UserDao userDao;

	
	@Override
	public User selectUserById(Integer id) {
		
		return userDao.selectUserById(id);
		
	}


	/**
	 * 用户登陆
	 */
	@Override
	public String doLogin(String userName, String password) {
		// TODO Auto-generated method stub
		Map<String,Object> map=new HashMap(); 
		map.put("userName",userName);
		map.put("password", password);
		User user= userDao.doLogin(map);
		try {
			String token=JwtToken.createToken(user.getId());
			return token;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "";
	}

}
