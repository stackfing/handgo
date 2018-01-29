package com.stackfing.front.controller;

import com.stackfing.common.service.AddressService;
import com.stackfing.common.service.CustomerService;
import com.stackfing.pojo.Address;
import com.stackfing.pojo.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: fing
 * @Description:
 * @Date: 下午2:26 18-1-29
 */

@Controller
@RequestMapping("/pay")
public class PayController {

	@Autowired
	private CustomerService customerService;

	@Autowired
	private AddressService addressService;

	@GetMapping("")
	public String toPay(HttpServletRequest request, Model model) {
		request.getSession().setAttribute("id", 1L);
		List<Address> addressList = addressService.findAll((Long) request.getSession().getAttribute("id"));
		model.addAttribute("address", addressList);
		return "home/pay";
	}

}
