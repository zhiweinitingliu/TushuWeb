package com.dukang.tushu.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface IImageUploadService {
	
	public int uploadImage(HttpServletRequest request, HttpServletResponse response);
}
