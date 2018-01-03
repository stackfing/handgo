//package com.stackfing.handgo.pojo;
//
//import org.springframework.stereotype.Component;
//
///**
// * @Author: fing
// * @Description:
// * @Date: 下午9:35 17-12-22
// */
//@Component
//public class ResultGenerator {
//
//	private static final String DEFAULT_SUCCESS_MESSAGE = "SUCCESS";
//
//	public static Result genSuccessResult() {
//		return new Result()
//				.setCode(ResultCode.SUCCESS)
//				.setMessage(DEFAULT_SUCCESS_MESSAGE);
//	}
//
//	public static Result genSuccessResult(Object data) {
//		return new Result()
//				.setCode(ResultCode.SUCCESS)
//				.setMessage(DEFAULT_SUCCESS_MESSAGE)
//				.setData(data);
//	}
//
//	public static Result genFailResult(String message) {
//		return new Result()
//				.setCode(ResultCode.FAIL)
//				.setMessage(message);
//	}
//}
