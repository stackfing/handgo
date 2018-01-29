package com.stackfing.pojo;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.util.Date;

/**
 * @Author: fing
 * @Description:
 * @Date: 下午1:21 18-1-26
 */

@Entity
@Data
public class Customer {

	@Id
	@GeneratedValue
	private Long id;

	private boolean sex;

	private String account;

	private String password;

	private String phoneNumber;

	private String email;

	private int status = 0;

	private Date createTime;

	private Date updateTime;
}
