package com.stackfing.handgo.controller;

import com.stackfing.handgo.entity.ProductType;
import com.stackfing.handgo.service.ProductTypeService;
import com.stackfing.handgo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.FileOutputStream;
import java.util.List;

@Controller
public class IndexController {

    @Autowired
    private UserService userService;

    @Autowired
	private ProductTypeService productTypeService;

	@GetMapping("/")
	public String index(ModelMap modelMap) {
		List<ProductType> allType = productTypeService.findAllType();
		modelMap.put("allType", allType);
		return "index";
	}

	@RequestMapping(value="/gouploadimg", method = RequestMethod.GET)
	public String goUploadImg() {
		//跳转到 templates 目录下的 uploadimg.html
		return "uploadimg";
	}

	@GetMapping("/upload")
	public String upload() {
		return "admin/upload";
	}

	//处理文件上传
	@RequestMapping(value="/testuploadimg", method = RequestMethod.POST)
	public @ResponseBody
	String uploadImg(@RequestParam("file") MultipartFile file,
					 HttpServletRequest request) throws Exception {
		String fileName = file.getOriginalFilename();
		FileOutputStream fos = new FileOutputStream(new File("/home/fing/" + fileName));
		fos.write(file.getBytes());
		fos.flush();
		fos.close();
		//返回json
		return "uploadimg success";
	}
}
