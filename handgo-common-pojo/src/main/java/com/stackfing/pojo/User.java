package com.stackfing.pojo;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.sql.Date;

@Data
@Entity
public class User {

	@Id
	@GeneratedValue
    private Long id;	//用户id

	@NotNull
	private String phoneNumber;	//手机号

	@NotNull
	private String email;		//邮箱

    @NotNull
    private String account;		//账号

    @NotNull
    private String password;	 //密码

    @NotNull
    private int status;			//用户状态

    private String headPhoto; 	//头像地址

	@NotNull
	private String permission;	//权限   权限表

    @NotNull
    private Date createTime;	//创建日期

	private Date lastLoginTime;	//上次登录时间
}
