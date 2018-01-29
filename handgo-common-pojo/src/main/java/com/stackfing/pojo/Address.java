package com.stackfing.pojo;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @Author: fing
 * @Description:
 * @Date: 下午2:16 18-1-29
 */
@Data
@Entity
public class Address {

	@Id
	@GeneratedValue
	private Integer id;

	private Long customerId;

	private int isPrimary;

	private String name;

	private String phoneNumber;

	private String address;

}
