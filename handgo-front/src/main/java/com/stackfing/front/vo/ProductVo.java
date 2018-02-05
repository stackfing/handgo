package com.stackfing.front.vo;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @Author: fing
 * @Description:
 * @Date: 下午12:50 18-2-5
 */

@Data
public class ProductVo {

	private String href;

	private String name;

	private BigDecimal price;

	private int sales;

}
