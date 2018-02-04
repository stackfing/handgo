package com.stackfing.pojo;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

/**
 * @Author: fing
 * @Description:
 * @Date: 下午5:37 18-1-31
 */

@Data
@Entity
public class OrderMaster {

	@Id
	@GeneratedValue
	private Long id;

	private String orderId;

	private Long customerId;

	private String address;

	private int status;

	private Date createTime;

}
