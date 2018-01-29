package com.stackfing.pojo;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

/**
 * @Author: fing
 * @Description:
 * @Date: 下午1:18 18-1-26
 */
@Data
public class User {

	@Id
	@GeneratedValue
	protected Long id;

	protected boolean sex;

	protected String account;

	protected String password;

	protected String phoneNumber;

	protected String email;

	protected int status = 0;

	protected Date createTime;

	protected Date updateTime;

}
