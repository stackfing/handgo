package com.stackfing.pojo;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigDecimal;

/**
 * @Author: fing
 * @Description:
 * @Date: 下午5:20 18-1-31
 */

@Data
@Entity
public class OrderDetail {

	@Id
	@GeneratedValue
	private Long id;

	private String orderId;

	private Long productId;

	private String color;

	private Integer total;

	private BigDecimal price;

}
