package com.stackfing.common.utils;

import ch.qos.logback.core.pattern.util.RegularEscapeUtil;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.stackfing.common.enums.ResultCode;
import lombok.ToString;

/**
 * @Author: fing
 * @Description:
 * @Date: 下午5:07 18-1-3
 */
@ToString
public class Result {

	@JsonProperty("code")
	private int code;

	@JsonProperty("msg")
	private String message;

	@JsonProperty("data")
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

	public static Result success(String message) {
		Result result = new Result();
		result.setCode(ResultCode.SUCCESS);
		result.setMessage(message);
		return result;
	}

	public static Result error(String message) {
		Result result = new Result();
		result.setCode(ResultCode.FAIL);
		result.setMessage(message);
		return result;
	}

	public static Result success(Object data) {
		Result result = new Result();
		result.setCode(ResultCode.SUCCESS);
		result.setData(data);
		return result;
	}

	public static Result success(Object data, String message) {
		Result result = new Result();
		result.setCode(ResultCode.SUCCESS);
		result.setMessage(message);
		result.setData(data);
		return result;
	}
}
