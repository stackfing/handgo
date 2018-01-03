package com.stackfing.handgo.common.enums;

import lombok.Getter;

@Getter
public enum ResultCode {
	OK(200),
	SUCCESS(0),//成功
	FAIL(400),//失败
	UNAUTHORIZED(401),//未认证（签名错误）
	NOT_FOUND(404),//接口不存在
	INTERNAL_SERVER_ERROR(500),;//服务器内部错误

	private final int code;

	ResultCode(int code) {
		this.code = code;
	}

	public int code() {
		return code;
	}
}
