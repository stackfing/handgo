package com.stackfing.common.exception;

/**
 * @Author: fing
 * @Description:
 * @Date: 下午4:47 18-1-21
 */
public class HandgoException extends RuntimeException {
	public HandgoException(String message) {
		super(message);
	}

	public HandgoException(String message, Throwable cause) {
		super(message, cause);
	}
}
