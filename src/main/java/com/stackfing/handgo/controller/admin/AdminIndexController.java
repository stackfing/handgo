package com.stackfing.handgo.controller.admin;

import com.stackfing.handgo.entity.ProductType;
import com.stackfing.handgo.entity.User;
import com.stackfing.handgo.service.ProductTypeService;
import com.stackfing.handgo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/admin")
public class AdminIndexController {

	@Autowired
	private ProductTypeService productTypeService;

	@Autowired
	private UserService userService;

	@GetMapping("/")
	public String index(ModelMap modelMap) {
		System.out.println("sadf");
		
		List<ProductType> allType = productTypeService.findAllType();
		modelMap.put("allType", allType);
		List<User> allUser = userService.findAllUser();
		modelMap.put("allUser", allUser);
		return "admin/index";
	}

	@GetMapping("")
	public String toindex(ModelMap modelMap) {
		System.out.println("sdafsdf");
		List<ProductType> allType = productTypeService.findAllType();
		modelMap.put("allType", allType);
		List<User> allUser = userService.findAllUser();
		modelMap.put("allUser", allUser);
		return "admin/index";
	}

}
