package com.stackfing.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.Date;

@Data
@Entity
public class Product {

	@Id
	@GeneratedValue
    private Long id;   //id

    @NotNull
    private String name; //产品名

	@NotNull
	private Long productCategoryId;

    private String photo;    //产品图片地址

//    @NotNull
    private BigDecimal price; //价格

//    @NotNull
    private int quantity;   //供货数量

    private int sold;   //已经出售数量

//    @NotNull
    private int status; //产品状态 1 上架 0 下架

//	@JsonIgnore
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
	private Date createTime;

//	@JsonIgnore
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
	private Date updateTime;

}
