package com.stackfing.pojo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Max;

@Entity
@Data
public class ProductCategory {

//    private Long typeId;    //类型id
//
//    @NotNull
//    private String typeName;    //类型名
//
//	@NotNull
//	private String typeLink; //地址

	@Id
	@GeneratedValue
	private Long id;

	private String name;	//分类名

	private Long parent;	//父节点

	private int avaliable;	//可用 0 不可用 1 可用

	private int rootTag;	//根节点标志

}
