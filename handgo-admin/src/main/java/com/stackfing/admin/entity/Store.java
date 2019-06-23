package com.stackfing.admin.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

/**
 * @Author: fing
 * @Description:
 * @Date: 下午5:14 19-6-7
 */
@Data
@Entity(name = "tb_store")
public class Store {

	@Id
	@GeneratedValue
	private Long id;

	private Long sellNumber;

	private Long totalNumber;

	private Boolean isDeleted;

	private Date updateTime;

	private Date createTime;
}
