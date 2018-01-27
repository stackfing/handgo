package com.stackfing.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Author: fing
 * @Description:
 * @Date: 下午10:35 18-1-26
 */
@Controller
public class NoticeController {

	@GetMapping("/notice")
	public String index() {
		return "notice";
	}

}
