package com.dukang.tushu.service.utils;

import javax.servlet.http.HttpServletRequest;

public class Utils {

	public static String getImageSaveUrl(HttpServletRequest request) {
		String savePath = request.getServletContext().getRealPath("");

		if (savePath.contains("/")) {
			// ubuntu 系统
			savePath = savePath.replace("/tushu/", "");
			savePath = savePath + "/images/";
		} else {
			savePath = savePath.replace("\\tushu\\", "");
			savePath = savePath + "\\images\\";
		}

		return savePath;
	}

}
