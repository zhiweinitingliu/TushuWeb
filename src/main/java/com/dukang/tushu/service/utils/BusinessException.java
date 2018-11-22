package com.dukang.tushu.service.utils;

/**
 * 通用的异常类
 * @author a1593
 *
 */
public class BusinessException extends RuntimeException {
	private int code=400;
	private String errorMessage="";
	public BusinessException(int code,String errorMessage) {
		this.code=code;
		this.errorMessage=errorMessage;
	}

}
