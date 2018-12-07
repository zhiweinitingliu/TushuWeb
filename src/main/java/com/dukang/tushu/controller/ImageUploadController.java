package com.dukang.tushu.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dukang.tushu.domain.ImageBean;
import com.dukang.tushu.service.IImageUploadService;
import com.dukang.tushu.service.utils.ResponseData;

@Controller
public class ImageUploadController {

	@Autowired
	private IImageUploadService imageUploadService;

	@RequestMapping(value = "/upload_image", method = RequestMethod.POST)
	@ResponseBody
	private ResponseData uploadImage(HttpServletRequest request, HttpServletResponse response) {
	
		try {
			ImageBean imageBean = imageUploadService.uploadImage(request, response);
			if (imageBean!=null) {
				return ResponseData.ok().putDataValue("image_info", imageBean);
			}
			return ResponseData.badRequest("上传失败");

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return ResponseData.badRequest(e.getMessage());
		}

	}

}
