package com.stackfing.front.vo;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @Author: fing
 * @Description:
 * @Date: 下午2:00 18-1-29
 */

@Data
public class KillProductVo {

	private Long id;

	private String photo;

	private BigDecimal price;

	private String name;
}
