package com.stackfing.common.utils;

import com.stackfing.common.enums.ResultCode;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @Author: fing
 * @Description:
 * @Date: 下午1:57 18-1-3
 */
@Data
public class HandgoResult {

	private int code;

	private String msg;

	private Object data;

	private Long total = 1L;

	public static HandgoResult success(String msg) {
		HandgoResult handgoResult = new HandgoResult();
		handgoResult.code = ResultCode.OK.getCode();
		handgoResult.data = null;
		handgoResult.msg = msg;
		return handgoResult;
	}

	public static HandgoResult success(Object data) {
		HandgoResult handgoResult = new HandgoResult();
		handgoResult.code = ResultCode.OK.getCode();
		handgoResult.data = data;
		handgoResult.msg = null;
		return handgoResult;
	}

	public static HandgoResult success(String msg, Object data) {
		HandgoResult handgoResult = new HandgoResult();
		handgoResult.msg = msg;
		if (data instanceof List) {
			List datas = new ArrayList();
			datas.addAll((Collection) data);
			handgoResult.data = datas;
			return handgoResult;
		} else {
			handgoResult.data = data;
		}
		return handgoResult;
	}

	public static HandgoResult success(int code, Object data) {
		HandgoResult handgoResult = new HandgoResult();
		handgoResult.msg = "ok";
		handgoResult.code = code;
		if (data instanceof List) {
			List datas = new ArrayList();
			datas.addAll((Collection) data);
			handgoResult.data = datas;
			return handgoResult;
		} else {
			handgoResult.data = data;
		}
		return handgoResult;
	}

	public static HandgoResult success(int code, String msg, Object data) {
		HandgoResult handgoResult = new HandgoResult();
		handgoResult.msg = msg;
		handgoResult.code = code;
		if (data instanceof List) {
			List datas = new ArrayList();
			datas.addAll((Collection) data);
			handgoResult.data = datas;
			return handgoResult;
		} else {
			handgoResult.data = data;
		}
		return handgoResult;
	}

	public static HandgoResult success(String msg, Object data, Long total) {
		HandgoResult handgoResult = new HandgoResult();
		handgoResult.code = 200;
		handgoResult.msg = msg;
		if (data instanceof List) {
			List datas = new ArrayList();
			datas.addAll((Collection) data);
			handgoResult.data = datas;
			handgoResult.total = total;
			return handgoResult;
		} else {
			handgoResult.data = data;
		}
		return handgoResult;
	}

	public static HandgoResult error(String msg) {
		HandgoResult handgoResult = new HandgoResult();
		handgoResult.code = ResultCode.FAIL.getCode();
		handgoResult.data = null;
		handgoResult.msg = msg;
		return handgoResult;
	}

	public HandgoResult Build(Object data) {
		this.data = data;
		return this;
	}

	public HandgoResult Build(int code) {
		this.code = code;
		return this;
	}

	public HandgoResult Build(String msg) {
		this.msg = msg;
		return this;
	}

//	private int code;
//
//	private String message;
//
//	private Object data;
//
//	public HandgoResult ok(Object data) {
//		this.data = data;
//		this.message = "ok";
//		this.code = ResultCode.OK.code();
//		return this;
//	}
//
//	public HandgoResult Build(int code) {
//		this.code = code;
//		return this;
//	}
//
//	public HandgoResult Build(String message) {
//		this.message = message;
//		return this;
//	}
//
//	public HandgoResult Build(Object data) {
//		this.data = data;
//		return this;
//	}
//
//	public HandgoResult ok(String message) {
//		this.message = message;
//		return this;
//	}
//
//	public HandgoResult faild(Object data) {
//		this.data = data;
//		this.message = "faild";
//		this.code = ResultCode.FAIL.code();
//		return this;
//	}
//
//	private static final String DEFAULT_SUCCESS_MESSAGE = "SUCCESS";
//
//	public static Result genSuccessResult() {
//		return new Result()
//				.setCode(ResultCode.SUCCESS)
//				.setMessage(DEFAULT_SUCCESS_MESSAGE);
//	}
//
//	public static Result genSuccessResult(Object data) {
//		return new Result()
//				.setCode(ResultCode.SUCCESS)
//				.setMessage(DEFAULT_SUCCESS_MESSAGE)
//				.setData(data);
//	}
//
//	public static Result genFailResult(String message) {
//		return new Result()
//				.setCode(ResultCode.FAIL)
//				.setMessage(message);
//	}

}
