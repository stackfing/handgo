package com.stackfing.front;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
@ComponentScan("com.stackfing")
public class FrontApplication {
	public static void main(String[] args) {
		SpringApplication.run(FrontApplication.class, args);
	}
}
