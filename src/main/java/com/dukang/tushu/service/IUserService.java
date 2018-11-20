package com.dukang.tushu.service;

import com.dukang.tushu.domain.User;

public interface IUserService {
	
	/**
	 * 通过用户id查询用户
	 * @param id 用户id
	 */
	public User selectUserById(Integer id);
}
