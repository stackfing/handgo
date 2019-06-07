package com.stackfing.admin.enums;

import lombok.Getter;

/**
 * @Author: fing
 * @Description:
 * @Date: 下午5:44 19-6-7
 */

@Getter
public enum ResultCode {

	UNKNOW_ERROR(-1, "未知错误"),
	SUCCESS(200, "响应成功"),
	ID_NOT_EQUALS(10003, "ID 不一致")
	;



	private int code;
	private String msg;
	ResultCode(int code, String msg) {
		this.code = code;
		this.msg = msg;
	}
}
