package com.stackfing.handgo.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.annotations.ColumnDefault;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
@NoArgsConstructor
@Data
@ToString
public class Provider {

    @Id
    @GeneratedValue
    private Long pid;   //供应商id

    @NotNull
    private String account; //账号

    @NotNull
    private String password;    //密码

    @NotNull
    private int status = 1;	//供应商状态

    @NotNull
    @ColumnDefault("1")
    private int permission;	//供应商权限

}
