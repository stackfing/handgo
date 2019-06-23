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

	//角色名
	private String name;
	//角色描述
	private String description;
	//状态标志
	private Boolean isDeleted;
}
