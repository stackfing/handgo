package com.stackfing.pojo;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @Author: fing
 * @Description:
 * @Date: 下午10:22 18-1-26
 */

@Data
@Entity
public class Notice {

	@Id
	@GeneratedValue
	private Integer id;

	private String title;

	private String content;

	private String photo;

	private String type;

}
