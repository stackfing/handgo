package com.stackfing.admin.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

/**
 * @Author: fing
 * @Description:
 * @Date: 下午7:37 19-3-27
 */

@Data
@Entity(name = "tb_product")
public class Product {

	@Id
	@GeneratedValue
	private Long id;

	private String name;

	private BigDecimal oldPrice;

	private BigDecimal nowPrice;

	private String avatar;

	private String description;

	private Date updateTime;

	private Date createTime;

}
