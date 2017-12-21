package com.stackfing.handgo.common;

import lombok.Data;
import lombok.ToString;

@Data
public class JsonBodyUtil<T> {

	private int code;

	private String msg;

	private int count;

	private T data;

	public JsonBodyUtil send(int code, String msg, int count ,T data) {
		this.code = code;
		this.msg = msg;
		this.count = count;
		this.data = data;
		System.out.println(this.toString());
		return this;
	}



}
