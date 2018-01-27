package com.stackfing.front.vo;

import com.stackfing.common.vo.ProductVo;
import lombok.Data;

import java.util.List;
import java.util.Map;

/**
 * @Author: fing
 * @Description:
 * @Date: 下午3:42 18-1-27
 */

@Data
public class FrontCommendVo {

	private String title;

	private String subtitle;

	private List<FrontCategoryVo> categoryList;

	private List<FrontProductVo> starProduct;

}
