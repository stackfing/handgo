//package com.stackfing.home.controller;
//
//import com.stackfing.pojo.Customer;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.*;
//
//import javax.servlet.http.HttpServletRequest;
//
///**
// * @Author: fing
// * @Description:
// * @Date: 上午10:17 18-1-28
// */
//@Controller
//@RequestMapping("/person")
//public class InformationController {
//
//	@Autowired
//	private CustomerServiceImpl customerService;
//
//	@GetMapping("/information")
//	public String information(HttpServletRequest request, Model model) {
//		Long id = (Long) request.getSession().getAttribute("id");
//		Customer result = customerService.findById(id);
//
////		Customer customer = new Customer();
////		customer.setAccount("admin");
////		customer.setPhoneNumber("12345678911");
////		customer.setSex(true);
////		customer.setEmail("123123@11.com");
//		model.addAttribute("userimformation", result);
//
//		return "person/information";
//	}
//
//	@PostMapping("/information/{id}")
//	@ResponseBody
//	public String update(@PathVariable Long id, Customer customer) {
//		Customer res = customerService.updateInformation(id, customer);
//		if (res != null) {
//			return "ok";
//		}
//		return "error";
//	}
//
//	@GetMapping("/vue")
//	public String vue() {
//		return "vue";
//	}
//
//	@GetMapping("/getjson")
//	@ResponseBody
//	public String get() {
//		return "ok";
//	}
//
//}
