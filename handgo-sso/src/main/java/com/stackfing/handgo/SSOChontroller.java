package com.stackfing.handgo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author: fing
 * @Description:
 * @Date: 下午1:30 18-1-3
 */
@Controller
public class SSOChontroller {

	@GetMapping("/")
	@ResponseBody
	public String get() {
		return "hi";
	}

}
