package com.dukang.tushu.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dukang.tushu.domain.ImageBean;

public interface IImageUploadService {
	
	public ImageBean uploadImage(HttpServletRequest request, HttpServletResponse response) throws Exception;
}
