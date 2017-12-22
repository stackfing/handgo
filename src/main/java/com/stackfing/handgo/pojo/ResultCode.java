package com.stackfing.handgo.pojo;

/**
 * @Author: fing
 * @Description:
 * @Date: 下午9:33 17-12-22
 */
public enum ResultCode {
	SUCCESS(0),//成功
	FAIL(400),//失败
	UNAUTHORIZED(401),//未认证（签名错误）
	NOT_FOUND(404),//接口不存在
	INTERNAL_SERVER_ERROR(500);//服务器内部错误

	private final int code;

	ResultCode(int code) {
		this.code = code;
	}

	public int code() {
		return code;
	}
}
