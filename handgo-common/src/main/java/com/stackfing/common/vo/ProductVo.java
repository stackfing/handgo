package com.stackfing.common.vo;

import lombok.Data;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

/**
 * @Author: fing
 * @Description:
 * @Date: 下午6:47 18-1-21
 */
@Data
public class ProductVo {
	@NotNull(message = "产品名不能为空")
	private String name;
	@NotNull(message = "价格不能为空")
	@Min(value = 0,message = "价格不能低于 0 元")
	private BigDecimal price;
	@NotNull(message = "产品分类不能为空")
	private Long categoryId;
	private String photo;
	private String description;
	@NotNull(message = "库存不能为空")
	private Long quantity;
}
