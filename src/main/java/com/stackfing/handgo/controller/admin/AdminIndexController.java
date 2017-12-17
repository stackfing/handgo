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

	@GetMapping("")
	public String index(ModelMap modelMap) {
		List<ProductType> allType = productTypeService.findAllType();
		modelMap.put("allType", allType);
		List<User> allUser = userService.findAllUser();
		modelMap.put("allUser", allUser);
		return "admin/index";
	}

	@GetMapping("user/{uid}")
	public String editUser(@PathVariable Long uid, ModelMap modelMap) {
		User user = userService.findOneById(uid);
		modelMap.put("userDetail", user);
		return "admin/user-edit";
	}

	@PostMapping("user/submit")
	public String postUser(User user) {
		userService.save(user);
		return "redirect:/admin";
	}
}
