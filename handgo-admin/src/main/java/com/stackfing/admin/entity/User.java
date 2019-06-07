package com.stackfing.admin.entity;

import lombok.Data;
import org.hibernate.mapping.UniqueKey;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

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
	private Long id;

	@Column(unique = true)
	private String username;

	private String avatar;

	private String sex;

	@Column(unique = true)
	private String email;

	private Date updateTime;

	private Date createTime;

}
