package com.stackfing.admin.aop;

import com.stackfing.admin.Exception.HandgoException;
import com.stackfing.admin.enums.ResultCode;
import com.stackfing.admin.utils.Result;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author: fing
 * @Description:
 * @Date: 下午5:59 19-6-7
 */

@RestControllerAdvice
public class ExceptionHandler {

	@org.springframework.web.bind.annotation.ExceptionHandler(value = Exception.class)
	public Result errorHandler(HttpServletRequest request, HttpServletResponse response, Exception e) throws Exception {
		e.printStackTrace();
		Result result = Result.getInstance();
		result.setCode(ResultCode.UNKNOW_ERROR.getCode());
		result.setMsg(e.getMessage());
		return result;
	}
}
