package com.dukang.tushu.service;

import com.dukang.tushu.domain.User;

public interface IUserService {

	/**
	 * 通过用户id查询用户
	 * 
	 * @param id 用户id
	 */
	public User selectUserById(Integer id);

	/**
	 * 用户登陆
	 * 
	 * @param userName
	 * @param password
	 * @return
	 */
	public String doLogin(String userName, String password);
	
}
