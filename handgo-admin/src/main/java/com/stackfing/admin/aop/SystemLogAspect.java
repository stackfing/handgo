package com.stackfing.admin.aop;


import com.stackfing.common.utils.SystemLog;
import jdk.nashorn.internal.runtime.regexp.joni.constants.EncloseType;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

@Aspect
@Component
@Slf4j
public class SystemLogAspect {

	@Autowired(required = false)
	private HttpServletRequest request;

//	@Pointcut("execution(* com.stackfing.admin.controller.admin..*(..))")
//	public void controllerMethodPointcut(){}

	@Pointcut("execution(* com.stackfing.*.controller.*..*(..))")
public void controllerLogPointcut(){}

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
		StringBuffer sb = new StringBuffer("( ");
//		Iterator iterator = logParams.keySet().iterator();
//		while (iterator.hasNext()) {
//			String key = (String) iterator.next();
//			sb.append(key).append("="+logParams.get(key)).append("|");
//		}
//		String s = sb.toString();
//		System.out.println(s);
		Set<Map.Entry<String, String[]>> set = logParams.entrySet();
		Iterator<Map.Entry<String, String[]>> it = set.iterator();
		while (it.hasNext()) {
			Map.Entry<String, String[]> entry = it.next();
			sb.append(entry.getKey()+" = ");
			for (String i : entry.getValue()) {
				sb.append(i);
			}
			sb.append(" | ");
		}
		sb.append(" )");
		log.info(new SystemLog()
				.setId(10000L)
				.setName("name")
				.setType(1)
				.setUrl(request.getRequestURI())
				.setRequestType(request.getMethod())
				.setrequestParam(sb.toString())
				.setUser(null)
				.setIp(null)
				.setIpInfo("null")
				.setTime(null)
				.setCreateDate(null)
				.commit());
	}
}
