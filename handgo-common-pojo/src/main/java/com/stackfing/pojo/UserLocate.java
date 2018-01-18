package com.stackfing.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Data
@Entity
public class UserLocate {

	@Id
	@GeneratedValue
	private Integer id;

	private String name;	//地址

	@NotNull
	private boolean primary;//默认地址

}
