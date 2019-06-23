//package com.stackfing.front.controller;
//
//import com.stackfing.front.pojo.CartItem;
//import com.stackfing.front.vo.FrontProductVo;
//import com.stackfing.pojo.Product;
//import com.stackfing.service.ProductService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//
//import javax.persistence.Id;
//import javax.servlet.http.Cookie;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.util.ArrayList;
//import java.util.List;
//
///**
// * @Author: fing
// * @Description:
// * @Date: 下午10:11 18-3-8
// */
//
//@Controller
//public class GateController {
//
//	@Autowired
//	private ProductService productService;
//
//	@GetMapping("/gate")
//	public String gate(Long pid, Model model, HttpServletResponse response, HttpServletRequest request) {
//		model.addAttribute("product", productService.getProductById(pid));
//		List<CartItem> list = new ArrayList();
//		CartItem cartItem = new CartItem();
//		Product product = productService.getProductById(pid);
//		cartItem.setId(pid);
////		cartItem.setImage(product.getPhotos());
//		list.add(cartItem);
//		System.out.println(list.toString());
//		Cookie cookie = new Cookie("cart_list", list.toString());
//		Cookie[] cookies = request.getCookies();
//
//		//TODO 多次访问添加cookie问题
//		response.addCookie(cookie);
//		return "/home/gate-success";
//	}
//
//	private String[] getProductItem(String cookies) {
//		String [] s = new String[2];
//		return s;
//	}
//
//}
