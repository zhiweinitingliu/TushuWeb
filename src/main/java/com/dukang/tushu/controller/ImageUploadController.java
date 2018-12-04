package com.dukang.tushu.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dukang.tushu.service.IImageUploadService;
import com.dukang.tushu.service.utils.ResponseData;

@Controller
public class ImageUploadController {

	@Autowired
	private IImageUploadService imageUploadService;

	@RequestMapping(value="/upload_image",method=RequestMethod.POST)
	@ResponseBody
	private ResponseData uploadImage(HttpServletRequest request, HttpServletResponse response) {
		int resultCode=imageUploadService.uploadImage(request, response);
		if (resultCode==1) {
			return ResponseData.ok();
		}
		
		return ResponseData.badRequest();

	}

}
