package com.stackfing.common.enums;

public enum ProductRootEnum {

	ISROOT(1),
	ISNOTROOT(0);

	private final int tag;

	ProductRootEnum(int tag) {
		this.tag = tag;
	}

	public int getTag() {
		return this.tag;
	}
}
