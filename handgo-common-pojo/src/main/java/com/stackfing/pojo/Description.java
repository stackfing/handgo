package com.stackfing.pojo;

import lombok.Data;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * @Author: fing
 * @Description:
 * @Date: 下午2:16 18-1-21
 */

@Entity
@Data
public class Description {

	@Id
	@GeneratedValue
	private Long id;

	@NotNull
	private Long productId;

	private String description;

}
