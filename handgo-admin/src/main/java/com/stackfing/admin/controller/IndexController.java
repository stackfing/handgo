package com.stackfing.admin.controller;

import com.stackfing.admin.service.ProductTypeService;
import com.stackfing.admin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

@Controller
public class IndexController {

	@Autowired
	private UserService userService;

	@Autowired
	private ProductTypeService productTypeService;

	@GetMapping("/")
	public String index(Model model, HttpServletRequest request) {
		if (request.getCookies() != null) {
			Cookie[] cookies = request.getCookies();
			for (Cookie c : cookies) {
				if (c.getName().equals("token")) {
					model.addAttribute("token", c.getValue());
				}
			}
		}
		model.addAttribute("siteName", "电子商城");
//		List<ProductType> allType = productTypeService.findAllType();
//		modelMap.put("allType", allType);
//		Cookie cookie = new Cookie("uid", "1");
//		Cookie cookie1 = new Cookie("token", "token");
//		response.addCookie(cookie);
//		response.addCookie(cookie1);
		return "index";
	}

//	@RequestMapping(value = "/gouploadimg", method = RequestMethod.GET)
//	public String goUploadImg() {
//		//跳转到 templates 目录下的 uploadimg.html
//		return "uploadimg";
//	}
//
//	@GetMapping("/upload")
//	public String upload() {
//		return "admin/upload";
//	}

//	//处理文件上传
//	@RequestMapping(value = "/testuploadimg", method = RequestMethod.POST)
//	public @ResponseBody
//	String uploadImg(@RequestParam("file") MultipartFile file,
//					 HttpServletRequest request) throws Exception {
//		String fileName = file.getOriginalFilename();
//		FileOutputStream fos = new FileOutputStream(new File("/home/fing/" + fileName));
//		fos.write(file.getBytes());
//		fos.flush();
//		fos.close();
//		//返回json
//		return "uploadimg success";
//	}
//
//	@GetMapping("/tests")
//	@ResponseBody
//	public String testst() {
////		System.out.println(page);
//		return "";
//	}
//
//	@GetMapping("/tree")
//	public String tree() {
//		return "admin/tree";
//	}
}
