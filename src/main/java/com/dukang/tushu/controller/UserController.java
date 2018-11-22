package com.dukang.tushu.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dukang.tushu.domain.BaseResultBean;
import com.dukang.tushu.domain.User;
import com.dukang.tushu.service.IUserService;
import com.dukang.tushu.service.utils.ResponseData;

@Controller
public class UserController {
	
	@Autowired
	private IUserService userService;
	
	@RequestMapping("/select_user")
	@ResponseBody
	public User selectUserById(HttpServletRequest request, HttpServletResponse response) {
		User user=userService.selectUserById(100001);
		if (user!=null) {
			return user;
		}
		return new User();
		
	}
	
	@RequestMapping(value="/login_act",method=RequestMethod.POST)
	@ResponseBody
	public ResponseData doLogin(HttpServletRequest request, HttpServletResponse response) {
		String userName=request.getParameter("user_name");
		String password=request.getParameter("password");
		String token=userService.doLogin(userName,password);	
		BaseResultBean baseResultBean=new BaseResultBean();
		baseResultBean.setCode(200);
		baseResultBean.setToken(token);
		
		ResponseData responseData=ResponseData.ok();
		responseData.putDataValue("token", token);
		return responseData;
	}
}
