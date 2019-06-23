//package com.stackfing.front.serviceImpl;
//
//import com.stackfing.front.service.CartService;
//import com.stackfing.service.ProductService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import javax.servlet.http.Cookie;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
///**
// * @Author: fing
// * @Description:
// * @Date: 下午4:58 18-3-24
// */
//@Service
//public class CartServiceImpl implements CartService {
//
//	@Autowired
//	private ProductService productService;
//
//	@Override
//	public boolean addItem(Long pid, HttpServletResponse response) {
//		if (productService.getProductById(pid).getStock() >= 1) {
//			Cookie cookie = new Cookie("","");
//			response.addCookie(cookie);
//			return true;
//		}
//		return false;
//	}
//}
