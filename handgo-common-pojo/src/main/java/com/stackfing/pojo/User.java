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
	private Long id;

	private boolean sex;

	private String account;

	private String password;

	private String phoneNumber;

	private int status = 0;

	private Date createTime;

	private Date updateTime;

}
