package com.stackfing.pojo;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @Author: fing
 * @Description:
 * @Date: 下午6:35 18-1-27
 */

@Data
@Entity
public class CommendCategory {

	@Id
	@GeneratedValue
	private Long id;

	private Long  categoryId;

	private String name;

	private boolean rootTag;
}
