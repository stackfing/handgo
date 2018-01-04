package com.stackfing.handgo.admin.pojo;

import com.stackfing.handgo.admin.entity.ProductType;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
 * @Author: fing
 * @Description:
 * @Date: 下午2:55 18-1-2
 */

@Data
@ToString
public class TreeRoot {

	private Long id;

	private String name;

	private List<ProductType> children;

}
