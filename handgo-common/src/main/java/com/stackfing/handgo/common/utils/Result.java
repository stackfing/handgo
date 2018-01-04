package com.stackfing.handgo.common.utils;

import com.stackfing.handgo.common.enums.ResultCode;
import lombok.ToString;

/**
 * @Author: fing
 * @Description:
 * @Date: 下午5:07 18-1-3
 */
@ToString
public class Result {

	private int code;

	private String message;

	private Object data;

	public Result setCode(ResultCode resultCode) {
		this.code = resultCode.code();
		return this;
	}

	public int getCode() {
		return code;
	}

	public String getMessage() {
		return message;
	}

	public Result setMessage(String message) {
		this.message = message;
		return this;
	}

	public Object getData() {
		return data;
	}

	public Result setData(Object data) {
		this.data = data;
		return this;
	}
}
