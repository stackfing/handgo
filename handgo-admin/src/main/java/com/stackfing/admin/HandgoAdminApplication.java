package com.stackfing.admin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@MapperScan("com.stackfing.admin.mapper")
@Configuration
public class HandgoAdminApplication {
	public static void main(String[] args) {
		SpringApplication.run(HandgoAdminApplication.class, args);
	}
}
