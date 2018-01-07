package com.stackfing.common.utils;

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

	@JsonProperty("count")
	private Long count;

	@JsonProperty("data")
	private Object data;

	public void setCount(Long count) {
		this.count = count;
	}

	public Long getCount() {
		return this.count;
	}

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
