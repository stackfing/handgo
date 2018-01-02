package com.stackfing.handgo.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonView;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.validation.constraints.NotNull;

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

	private String name;

	private Long parent;

}
