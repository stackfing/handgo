package com.stackfing.home.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;
import org.springframework.session.web.http.CookieSerializer;
import org.springframework.session.web.http.DefaultCookieSerializer;

/**
 * @Author: fing
 * @Description:
 * @Date: 下午4:27 18-1-26
 */

@Configuration
@EnableRedisHttpSession
public class RedisSessionConfig {
	@Bean
	public CookieSerializer cookieSerializer() {
		DefaultCookieSerializer defaultCookieSerializer = new DefaultCookieSerializer();
		//域
		defaultCookieSerializer.setDomainName("stackfing.com");

		return defaultCookieSerializer;
	}
}
