package com.stackfing.handgo.pojo;

import com.stackfing.handgo.entity.ProductType;
import lombok.Data;
import lombok.ToString;

import javax.validation.constraints.Max;
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
