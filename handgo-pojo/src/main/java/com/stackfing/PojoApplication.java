package com.stackfing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@EntityScan("com.stackfing")
@Configuration
public class PojoApplication {
	public static void main(String[] args) {
		SpringApplication.run(PojoApplication.class, args);
	}
}
