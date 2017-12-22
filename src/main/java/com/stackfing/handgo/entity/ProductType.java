package com.stackfing.handgo.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.validation.constraints.NotNull;

@NoArgsConstructor
@Data
@ToString
public class ProductType {

    private Long typeId;    //类型id

    @NotNull
    private String typeName;    //类型名

	@NotNull
	private String typeLink; //地址

}
