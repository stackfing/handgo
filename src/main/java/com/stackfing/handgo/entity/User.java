package com.stackfing.handgo.entity;


import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.sql.Date;

@Entity
@NoArgsConstructor
@Data
@ToString
public class User {

    @Id
    @GeneratedValue
    private Long uid;	//用户id

    @NotNull
    private int permission = 1;	//用户权限

    private Date lastLogin;	//上次登录时间

    @NotNull
    private String account;	//账号

    @NotNull
    private String password; //密码

    @NotNull
    private int status;	//用户状态

    private String headPhoto; //头像地址

    @NotNull
    private String phoneNumber;	//手机号

    @NotNull
    private String email;	//邮箱

    @NotNull
    private Date createDate;	//创建日期


}
