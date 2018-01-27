package com.stackfing.pojo;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @Author: fing
 * @Description:
 * @Date: 下午7:29 18-1-27
 */

@Data
@Entity
public class ProductPhotos {

	@Id
	@GeneratedValue
	private Long id;

	private Long productId;

	private String url;

}
