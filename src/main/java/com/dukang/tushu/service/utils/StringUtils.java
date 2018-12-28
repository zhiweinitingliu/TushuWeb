package com.dukang.tushu.service.utils;

public class StringUtils {

	public static boolean isEmpty(String str) {
		if (str == null || str.length() <= 0) {
			return true;
		}
		return false;
	}

	public static int parseStrToInt(String value) {

		if (isEmpty(value)) {
			return 0;
		}

		try {
			return Integer.parseInt(value);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return 0;
	}

}
