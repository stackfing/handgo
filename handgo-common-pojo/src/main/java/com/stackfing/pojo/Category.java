package com.stackfing.pojo;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class Category {

	@Id
	@GeneratedValue
	private Integer id;

	private String name;	//分类名

	private int parent;	//父节点

	private int avaliable;	//可用 0 不可用 1 可用

	private int rootTag;	//根节点标志

//	@Transient
//	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
//	@JsonIgnore
//	private Date createTime;

//	@Transient
//	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
//	@JsonIgnore
//	private Date updateTime;

}
