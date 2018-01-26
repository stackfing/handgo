package com.stackfing.admin.aop;

import com.stackfing.common.utils.HandgoResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

/**
 * @Author: fing
 * @Description:
 * @Date: 下午5:15 18-1-21
 */
@ControllerAdvice
@Slf4j
public class SpringExceptionHandler {

	/**
	 * 全局处理Exception
	 * 错误的情况下返回500
	 * @param ex
	 * @param req
	 * @return
	 */
	@ExceptionHandler(value = {Exception.class})
	public ResponseEntity<Object> handleOtherExceptions(final Exception ex, final WebRequest req) {
		HandgoResult handgoResult = new HandgoResult();
		handgoResult.setCode(500);
		handgoResult.setMsg(ex.getMessage());
		log.error(ex.getMessage());
		return new ResponseEntity<>(handgoResult, HttpStatus.INTERNAL_SERVER_ERROR);
	}

}
