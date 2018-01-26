package com.stackfing.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

@Data
@Entity
public class Product {

	@Id
	@GeneratedValue
    private Long id;   //id

    private String name; //产品名

    private String photo;    //产品图片地址

    private BigDecimal price; //价格

    private Long quantity;   //供货数量

    private int sold;   //已经出售数量

    private int status; //产品状态 1 上架 0 下架

//	@JsonIgnore
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
	private Date createTime;

//	@JsonIgnore
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
	private Date updateTime;

}
