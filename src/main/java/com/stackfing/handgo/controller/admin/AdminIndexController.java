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
	public String index() {
		return "admin/index";
	}

	@GetMapping("")
	public String toindex() {
		return "admin/index";
	}

	@GetMapping("/userlist")
	public String toTeset() {
		return "admin/users";
	}

	@GetMapping("/welcome")
	public String toHistory() {
		return "admin/welcome";
	}

	@GetMapping("/settings")
	public String toSettings() {
		return "admin/settings";
	}

	@GetMapping("/login")
	public String toLogin() {
		return "admin/login";
	}

	@PostMapping("/login")
	public String doLogin(String account, String password) {
		if (null == account || null == password) {

		} else {

		}
		return "";
	}
}
