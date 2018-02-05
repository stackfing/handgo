package com.stackfing.pojo;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @Author: fing
 * @Description:
 * @Date: 下午1:09 18-2-4
 */

@Entity
@Data
public class Banner {

	@Id
	@GeneratedValue
	private Integer id;

	private String url;

	private String photo;

}
