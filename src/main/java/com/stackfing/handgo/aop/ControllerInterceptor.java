package com.stackfing.handgo.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Aspect
@Component
public class ControllerInterceptor {

	@Pointcut("execution(* com.stackfing.handgo.controller.admin..*(..))")
	public void controllerMethodPointcut(){}

	@Before("controllerMethodPointcut()")
	public void isLogin() throws ServletException, IOException {
		HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
		HttpServletResponse response = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getResponse();

		if (request.getSession().getAttribute("user") == null) {
//			response.sendRedirect("/");
		} else {
			System.out.println("登录成功");
		}
	}
}
