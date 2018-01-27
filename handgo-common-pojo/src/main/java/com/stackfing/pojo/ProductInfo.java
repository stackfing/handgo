package com.stackfing.pojo;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigDecimal;

/**
 * @Author: fing
 * @Description:
 * @Date: 下午9:56 18-1-26
 */

@Data
@Entity
public class ProductInfo {
	@Id
	@GeneratedValue
	private Long id;

	//产品id
	private Long productId;

	//产品名称
	private String name;

	//现价
	private BigDecimal currentPrice;

	//原价
	private BigDecimal originalPrice;

	//月销量
	private Long mothSale;

	//累计销售
	private Long saleAmount;

	//评论数
	private Long discussCount;

	//产品图片
	private String[] photos;

	//产品详情
	private String discription;

	//库存
	private Long stock;
	//库存
	//产品分类
	//产品优惠券
}
