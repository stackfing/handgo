package com.stackfing.admin.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.sql.Date;

/**
 * @Author: fing
 * @Description:
 * @Date: 下午6:47 19-3-27
 */

@Data
@Entity(name = "tb_user")
public class User {
	@Id
	@GeneratedValue
	private Long id;

	//用户名
	@Column(unique = true)
	private String username;
	//密码
	private String password;
	//头地址
	private String avatar;
	//性别
	private Integer sex;
	//用户状态
	private Integer status;
	//邮件地址
	@Column(unique = true)
	private String email;
	//更新时间
	private Date updateTime;
	//创建时间
	private Date createTime;

}
