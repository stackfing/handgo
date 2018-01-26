package com.stackfing.common.vo;

import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * @Author: fing
 * @Description:
 * @Date: 下午12:42 18-1-26
 */
@Data
public class CategoryVo {

	@NotNull
	private String name;	//分类名

	private Integer parent = 0;	//父节点

	private int avaliable = 0;	//可用 0 不可用 1 可用

}
