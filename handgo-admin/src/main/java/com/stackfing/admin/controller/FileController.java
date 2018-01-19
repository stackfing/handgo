package com.stackfing.admin.controller;

import com.stackfing.common.utils.HandgoResult;
import com.stackfing.common.utils.QiNiuUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.InputStream;

/**
 * @Author: fing
 * @Description:
 * @Date: 下午9:00 18-1-19
 */

@Controller
public class FileController {


	@PostMapping("/upload")
	@ResponseBody
	public HandgoResult upload(@RequestBody MultipartFile file) {
		InputStream inputStream = null;
		try {
			inputStream = file.getInputStream();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return QiNiuUtil.uploadByStream(inputStream);
	}

}
