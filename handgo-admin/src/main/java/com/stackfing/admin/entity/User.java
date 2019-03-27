package com.stackfing.admin.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @Author: fing
 * @Description:
 * @Date: 下午6:47 19-3-27
 */

@Data
@Entity(name = "tb_user")
public class User {
	@Id
	@GeneratedValue
	private Integer id;
}
