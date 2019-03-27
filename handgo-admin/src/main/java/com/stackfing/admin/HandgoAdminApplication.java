package com.stackfing.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
public class HandgoAdminApplication {
	public static void main(String[] args) {
		SpringApplication.run(HandgoAdminApplication.class, args);
	}
}
