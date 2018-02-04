package com.stackfing.admin.controller.restController;

import com.stackfing.common.service.BannerService;
import com.stackfing.common.service.serviceImpl.BannerServiceImpl;
import com.stackfing.common.utils.HandgoResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: fing
 * @Description:
 * @Date: 下午1:30 18-2-4
 */

@RestController
@RequestMapping("/v1/banner")
public class BannerRestController {

	@Autowired
	private BannerServiceImpl bannerService;

	@GetMapping("")
	public HandgoResult list(@RequestParam(required = false) Integer page, @RequestParam(required = false) Integer size) {
		if (page == null || size == null) {
			return HandgoResult.success(bannerService.getBannerList());
		}
		return HandgoResult.success(bannerService.getBannerList(page,size));
	}

}
