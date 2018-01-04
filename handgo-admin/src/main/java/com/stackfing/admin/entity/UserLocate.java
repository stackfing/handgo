package com.stackfing.admin.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@NoArgsConstructor
@Data
@ToString
public class UserLocate {

    @Min(1)
    @Max(5)
    private int locateId;	//收货地址id

    @NotNull
    private String locate;	//收货地址

    @NotNull
    private int isPrimary = 0;	//是否默认地址

    private User user;

}
