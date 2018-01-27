package com.stackfing.front.vo;

import com.stackfing.pojo.Category;
import lombok.Data;

import java.util.List;

/**
 * @Author: fing
 * @Description:
 * @Date: 下午6:58 18-1-26
 */

@Data
public class CategoryVo {

	private String name;

	private List<Category> subCategories;

}
