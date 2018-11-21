package com.dukang.tushu.dao;

import java.util.Map;

import org.springframework.stereotype.Repository;

import com.dukang.tushu.domain.User;

@Repository
public interface UserDao {
	/**
	 * 通过用户id查询用户
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
	public User doLogin(Map<String,Object> map);
}
