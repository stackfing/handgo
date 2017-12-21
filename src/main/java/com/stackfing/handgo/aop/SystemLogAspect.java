package com.stackfing.handgo.aop;

import com.stackfing.handgo.pojo.SystemLog;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;
import java.util.Map;

@Aspect
@Component
@Slf4j
public class SystemLogAspect {

	@Autowired(required = false)
	private HttpServletRequest request;

//	@Pointcut("execution(* com.stackfing.handgo.controller.admin..*(..))")
//	public void controllerMethodPointcut(){}

	@Pointcut("execution(* com.stackfing.handgo.controller.*..*(..))")
	public void controllerLogPointcut(){}

//	@Before("controllerMethodPointcut()")
//	public void isLogin() throws ServletException, IOException {
//		HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
//		HttpServletResponse response = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getResponse();
//
//		if (request.getSession().getAttribute("user") == null) {
////			response.sendRedirect("/");
//		} else {
//			System.out.println("登录成功");
//		}
//	}

	@After("controllerLogPointcut()")
	public void writeLogger() {
		/*
		用于后置通知，用于controller操作
		日志标题
		类型
		url
		请求方式
		请求参数
		用户
		ip
		开始时间
		耗时
		 */
		Map<String, String[]> logParams = request.getParameterMap();

		log.info(new SystemLog()
				.setId(10000L)
				.setName("name")
				.setType(1)
				.setUrl(request.getRequestURI())
				.setRequestType(request.getMethod())
				.setrequestParam(logParams.toString())
				.setUser(null)
				.setIp(null)
				.setIpInfo("null")
				.setTime(null)
				.setCreateDate(null)
				.commit());
	}
}
