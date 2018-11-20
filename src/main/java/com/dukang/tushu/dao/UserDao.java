package com.dukang.tushu.dao;

import org.springframework.stereotype.Repository;

import com.dukang.tushu.domain.User;

@Repository
public interface UserDao {
	/**
	 * 通过用户id查询用户
	 * @param id 用户id
	 */
	public User selectUserById(Integer id);
}
