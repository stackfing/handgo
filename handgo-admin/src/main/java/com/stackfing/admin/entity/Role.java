package com.stackfing.admin.entity;

import lombok.Data;
import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @Author: fing
 * @Description:
 * @Date: 下午4:58 19-6-7
 */
@Data
@Entity(name = "tb_role")
public class Role {
	@Id
	@GeneratedValue
	private Integer id;

	private Long userId;

	private Long role;

	private String password;
}
