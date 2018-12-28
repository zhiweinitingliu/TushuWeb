package com.dukang.tushu.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dukang.tushu.domain.BookInfoBean;
import com.dukang.tushu.domain.ImageBean;
import com.dukang.tushu.service.IBookInfoService;
import com.dukang.tushu.service.impl.BookInfoServiceImpl;
import com.dukang.tushu.service.utils.JwtToken;
import com.dukang.tushu.service.utils.ResponseData;
import com.dukang.tushu.service.utils.StringUtils;

@Controller
public class BookInfoController {

	@Autowired
	private IBookInfoService bookInfoService;

	@RequestMapping(value = "/upload_bookInfo", method = RequestMethod.POST)
	@ResponseBody
	private ResponseData uploadImage(HttpServletRequest request, HttpServletResponse response) {

		String book_name = request.getParameter("book_name");
		String auth = request.getParameter("auth");
		String publish_house = request.getParameter("publish_house");
		String image = request.getParameter("image");
		int image_id = StringUtils.parseStrToInt(request.getParameter("image_id"));
		String token = request.getHeader("token");
		int id = JwtToken.getAppUID(token);
		

		Map<String, Object> map = new HashMap<>();
		map.put("book_name", book_name);
		map.put("auth", auth);
		map.put("publish_house", publish_house);
		map.put("image", image);
		map.put("image_id", image_id);

		try {
			BookInfoBean bookInfoBean = new BookInfoBean();
			bookInfoBean.setName(book_name);
			bookInfoBean.setAuth(auth);
			bookInfoBean.setPublish_house(publish_house);
			bookInfoBean.setImage(image);
			bookInfoBean.setImage_id(image_id);
			bookInfoBean.setPublish_user_id(id);
			bookInfoService.uploadBookInfo(bookInfoBean);
			return ResponseData.ok();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return ResponseData.badRequest(e.getMessage());
		}

	}
}
