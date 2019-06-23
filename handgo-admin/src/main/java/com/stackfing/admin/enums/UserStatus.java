package com.stackfing.admin.enums;

import lombok.Getter;

/**
 * @Author: fing
 * @Description:
 * @Date: 下午4:12 19-6-23
 */
@Getter
public enum UserStatus {

	USER_STATUS_NORMAL(10001, "正常"),
	USER_STATUS_NOT_ACTIVE(10002, "未激活"),
	USER_STATUS_ISDELETED(10003, "被删除"),
	;



	private int code;
	private String msg;
	UserStatus(int code, String msg) {
		this.code = code;
		this.msg = msg;
	}
}
