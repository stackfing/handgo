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
	private Long id;

	private String name;	//分类名

	private Long parent;	//父节点

	private int available;	//可用 0 不可用 1 可用

	private int rootTag;	//根节点标志

}
