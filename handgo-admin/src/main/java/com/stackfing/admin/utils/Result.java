package com.stackfing.admin.utils;

import com.stackfing.admin.enums.ResultCode;
import lombok.Data;

/**
 * @Author: fing
 * @Description:
 * @Date: 下午5:40 19-6-7
 */

@Data
public class Result {

	private int code;
	private String msg;
	private Object data;

	private static final Result res = new Result();

	private Result() {

	}

	public static Result getInstance() {
		return res;
	}

	public static Result ok(String msg, Object data) {
		Result result = res;
		result.msg = msg;
		result.data = data;
		result.code = ResultCode.SUCCESS.getCode();
		return result;
	}

	public static Result ok(Object data) {
		Result result = res;
		result.msg = ResultCode.SUCCESS.getMsg();
		result.data = data;
		result.code = ResultCode.SUCCESS.getCode();
		return result;

	}

	public static Result ok() {
		Result result = res;
		result.msg = ResultCode.SUCCESS.getMsg();
		result.data = null;
		result.code = ResultCode.SUCCESS.getCode();
		return result;
	}

	public static Result error(ResultCode rc) {
		Result result = res;
		result.msg = rc.getMsg();
		result.data = null;
		result.code = rc.getCode();
		return result;
	}

}
