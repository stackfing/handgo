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

	private Long categoryId;

    private String photos;    //产品图片地址

	private BigDecimal originalPrice; //原价格

	private String description;

    private BigDecimal currentPrice; //现价格

    private Long stock;   //供货数量

    private int saleAmount;   //已经出售数量

	//月销量
	private Long mothSale;

    private int status; //产品状态 1 上架 0 下架

//	@JsonIgnore
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
	private Date createTime;

//	@JsonIgnore
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
	private Date updateTime;

}
