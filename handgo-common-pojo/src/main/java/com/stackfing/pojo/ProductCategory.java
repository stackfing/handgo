package com.stackfing.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonIgnoreType;
import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Data
public class ProductCategory {

	@Id
	@GeneratedValue
	private Long id;

	private String name;	//分类名

	private Long parent;	//父节点

	private int avaliable;	//可用 0 不可用 1 可用

	private int rootTag;	//根节点标志

//	@Transient
//	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
	@JsonIgnore
	private Date createTime;

//	@Transient
//	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
	@JsonIgnore
	private Date updateTime;

}
