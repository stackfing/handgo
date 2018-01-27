package com.stackfing.front.vo;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @Author: fing
 * @Description:
 * @Date: 下午3:47 18-1-27
 */

@Data
public class FrontProductVo {

	private String photo;

	private String title;

	private Long id;

	private BigDecimal price;
}
