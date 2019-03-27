package com.stackfing.admin.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigDecimal;

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

	private BigDecimal nowPrice;

}
