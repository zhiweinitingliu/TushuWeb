package com.dukang.tushu.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dukang.tushu.domain.User;
import com.dukang.tushu.service.IUserService;
import com.dukang.tushu.service.utils.JwtToken;
import com.dukang.tushu.service.utils.ResponseData;

@Controller
public class UserController {

	@Autowired
	private IUserService userService;

	@RequestMapping("/get_user_info")
	@ResponseBody
	public ResponseData selectUserById(HttpServletRequest request, HttpServletResponse response) {
		String token = request.getHeader("token");
		int id = JwtToken.getAppUID(token);
		User user = userService.selectUserById(id);
		if (user == null) {
			return ResponseData.badRequest("查询出现问题了");
		}

		return ResponseData.ok().putDataValue("user_info", user);

	}

	@RequestMapping(value = "/login_act", method = RequestMethod.POST)
	@ResponseBody
	public ResponseData doLogin(HttpServletRequest request, HttpServletResponse response) {
		String userName = request.getParameter("user_name");
		String password = request.getParameter("password");
		String token = userService.doLogin(userName, password);

		ResponseData responseData = ResponseData.ok();
		responseData.putDataValue("token", token);
		return responseData;
	}
}
