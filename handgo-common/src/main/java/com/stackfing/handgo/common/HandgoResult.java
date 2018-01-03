package com.stackfing.handgo.common;

import com.stackfing.handgo.common.enums.ResultCode;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @Author: fing
 * @Description:
 * @Date: 下午1:57 18-1-3
 */
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class HandgoResult {

	private int code;

	private String message;

	private Object data;

	public HandgoResult ok(Object data) {
		this.data = data;
		this.message = "ok";
		this.code = ResultCode.OK.code();
		return this;
	}

	public HandgoResult Build(int code) {
		this.code = code;
		return this;
	}

	public HandgoResult Build(String message) {
		this.message = message;
		return this;
	}

	public HandgoResult Build(Object data) {
		this.data = data;
		return this;
	}

	public HandgoResult ok(String message) {
		this.message = message;
		return this;
	}

	public HandgoResult faild(Object data) {
		this.data = data;
		this.message = "faild";
		this.code = ResultCode.FAIL.code();
		return this;
	}

	private static final String DEFAULT_SUCCESS_MESSAGE = "SUCCESS";

	public static Result genSuccessResult() {
		return new Result()
				.setCode(ResultCode.SUCCESS)
				.setMessage(DEFAULT_SUCCESS_MESSAGE);
	}

	public static Result genSuccessResult(Object data) {
		return new Result()
				.setCode(ResultCode.SUCCESS)
				.setMessage(DEFAULT_SUCCESS_MESSAGE)
				.setData(data);
	}

	public static Result genFailResult(String message) {
		return new Result()
				.setCode(ResultCode.FAIL)
				.setMessage(message);
	}

}
