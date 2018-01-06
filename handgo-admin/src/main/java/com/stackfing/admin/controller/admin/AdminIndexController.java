package com.stackfing.admin.controller.admin;

import com.stackfing.admin.service.ProductTypeService;
import com.stackfing.admin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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

//	@GetMapping("/login")
//	public String toLogin() {
//		return "admin/login";
//	}
//
//	@PostMapping("/login")
//	public String doLogin(String account, String password) {
//		if (null == account || null == password) {
//
//		} else {
//
//		}
//		return "";
//	}

}
