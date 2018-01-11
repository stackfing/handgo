package com.stackfing.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.validation.constraints.NotNull;

@NoArgsConstructor
@Data
@ToString
public class Provider {

    private Long pid;   //供应商id

    @NotNull
    private String account; //账号

    @NotNull
    private String password;    //密码

    @NotNull
    private int status = 1;	//供应商状态

    @NotNull
    private int permission;	//供应商权限

}
