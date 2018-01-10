package com.stackfing.sso.pojo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.Max;

/**
 * @Author: fing
 * @Description:
 * @Date: 下午5:37 18-1-5
 */
@Getter
@Setter
@ToString
public class User {

	@Max(value = 3,message = "最大不能超过3")
	private String account;

	private String password;
}
