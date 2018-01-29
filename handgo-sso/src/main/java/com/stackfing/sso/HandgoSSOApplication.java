package com.stackfing.sso;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Author: fing
 * @Description:
 * @Date: 下午1:29 18-1-3
 */
@SpringBootApplication
@ComponentScan("com.stackfing")
public class HandgoSSOApplication {
	public static void main(String[] args) {
		SpringApplication.run(HandgoSSOApplication.class, args);
	}
}
