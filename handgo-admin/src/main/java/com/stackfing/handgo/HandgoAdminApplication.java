package com.stackfing.handgo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@MapperScan("com.stackfing.handgo.mapper")
@Configuration
public class HandgoAdminApplication {
	public static void main(String[] args) {
		SpringApplication.run(HandgoAdminApplication.class, args);
	}
}
