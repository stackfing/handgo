package com.stackfing.admin.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @Author: fing
 * @Description:
 * @Date: 下午6:18 19-6-23
 */

@Entity
@Data
public class UserRole {

	@Id
	@GeneratedValue
	private Long id;

	//用户 id
	private Long userId;

	//角色 id
	private Long roleId;
}
