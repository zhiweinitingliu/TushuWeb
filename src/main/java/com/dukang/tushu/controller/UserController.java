package com.dukang.tushu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dukang.tushu.domain.User;
import com.dukang.tushu.service.IUserService;

@Controller
public class UserController {
	
	@Autowired
	private IUserService userService;
	
	@RequestMapping("/select_user")
	@ResponseBody
	public User selectUserById() {
		User user=userService.selectUserById(100001);
		if (user!=null) {
			return user;
		}
		return new User();
		
	}
}
