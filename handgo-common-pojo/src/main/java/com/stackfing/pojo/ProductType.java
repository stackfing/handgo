package com.stackfing.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.validation.constraints.Max;

@NoArgsConstructor
@Data
@ToString
public class ProductType {

//    private Long typeId;    //类型id
//
//    @NotNull
//    private String typeName;    //类型名
//
//	@NotNull
//	private String typeLink; //地址

	private Long id;

	private Long pId;

	@Max(value = 2)
	private String name;

	private Long parent;

}
