package com.stackfing.handgo.sso.controller;

import com.stackfing.handgo.sso.service.SSOService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author: fing
 * @Description:
 * @Date: 下午2:13 18-1-3
 */

@Controller
@RequestMapping("/check")
public class CheckDataController {

	@Autowired
	private SSOService ssoService;

	@GetMapping("/{type}/{data}")
	@ResponseBody
	public HandgoResult checkData(@PathVariable Integer type, @PathVariable String data) {

		HandgoResult handgoResult = null;

		if (type == null) {
			handgoResult.Build(400).Build("faild").Build("类型不能为空");
		}

		if (type != 1 && type != 2 && type != 3) {
			handgoResult.Build(400).Build("faild").Build("类型错误");
		}

		if (data == null) {
			handgoResult.Build(400).Build("faild").Build("内容错误");
		}

		handgoResult = ssoService.checkData(type, data);

		if (handgoResult == null) {
			handgoResult = new HandgoResult(500, "faild", "服务器内部错误");
		}

		return handgoResult;
	}
}
