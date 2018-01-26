package com.stackfing.pojo;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.sql.Date;

/**
 * @Author: fing
 * @Description:
 * @Date: 下午2:27 18-1-26
 */

@Data
@Entity
public class KillProduct {

	@Id
	@GeneratedValue
	private Long id;

	private BigDecimal price;

	private Long productId;

	private String url;

	private String photo;

	private String name;

	private Date startTime;

	private Date emdTime;

}
