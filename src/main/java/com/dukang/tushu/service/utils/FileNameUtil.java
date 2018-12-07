package com.dukang.tushu.service.utils;

import java.util.Calendar;
import java.util.Random;
import java.util.stream.LongStream;

import com.dukang.tushu.domain.Constans;
import com.mysql.fabric.xmlrpc.base.Array;

public class FileNameUtil {

	/**
	 * 生成一个独一无二的图片名称
	 * 
	 * @return 图片名称
	 */
	public static String creatAloneFileName() {
		Calendar calendar = Calendar.getInstance();
		// 获取时间戳
		long timeStamp = calendar.getTimeInMillis();
		// 获取一个随机数
		Random random = new Random();
		LongStream longStream = random.longs(100, 100000000);

		// 获取一个随机字母
		String[] arr = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s",
				"t", "u", "v", "w", "x", "y", "z" };
		int index = (int) (Math.random() * arr.length);
		String randomLetter = arr[index];

		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append(timeStamp + "").append(longStream.toString()).append(randomLetter);

		try {
			return MD5.md5(stringBuffer.toString(), Constans.key);
		} catch (Exception exception) {
			return stringBuffer.toString();
		}
	}

}
