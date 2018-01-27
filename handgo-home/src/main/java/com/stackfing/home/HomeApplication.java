package com.stackfing.home;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
@ComponentScan("com.stackfing")
public class HomeApplication {
	public static void main(String[] args) {
		SpringApplication.run(HomeApplication.class, args);
	}
}
