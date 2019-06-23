package com.stackfing.admin.aop;

import com.stackfing.admin.enums.ResultCode;
import com.stackfing.admin.service.ProductService;
import com.stackfing.admin.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author: fing
 * @Description:
 * @Date: 下午5:59 19-6-7
 */

@RestControllerAdvice
public class GlobalExceptionHandler {

	@Autowired
	private ProductService productService;

	@org.springframework.web.bind.annotation.ExceptionHandler(value = Exception.class)
	public Result errorHandler(HttpServletRequest request, HttpServletResponse response, Exception e) throws Exception {
		e.printStackTrace();
		Result result = Result.getInstance();
		result.setCode(ResultCode.SERVER_INTERNAL_ERROR.getCode());
		result.setData(e.getStackTrace());

		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("异常类： ").append(e.getClass().getName()).append("; 异常信息： ").append(e.getLocalizedMessage());
		result.setMsg(stringBuilder.toString());

		result.setData(e.getStackTrace());

		return result;
	}
}
