package com.stackfing.common.enums;

import lombok.Getter;

@Getter
public enum AddressEnum {

	IS_PRIMARY(1),
	NOT_PRIMARY(0);

	private final int code;

	AddressEnum(int code) {
		this.code = code;
	}

	public int code() {
		return code;
	}

}
