package com.stackfing.admin.controller;

import com.stackfing.admin.service.ProductTypeService;
import com.stackfing.admin.service.UserService;
import org.hibernate.validator.internal.util.privilegedactions.GetMethod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;
import java.rmi.server.RMIServerSocketFactory;

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
//		return "index";
		return "redirect:/admin";
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

	@GetMapping("/restTest")
	@ResponseBody
	public String doGet() throws UnsupportedEncodingException {
		RestTemplate restTemplate = new RestTemplate();
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		HttpEntity<String> entity = new HttpEntity<>("",headers);
		ResponseEntity<String> stringResponseEntity = restTemplate.postForEntity("http://localhost:8888/rest", entity, String.class);
		System.out.println(stringResponseEntity);
		System.out.println(stringResponseEntity.getStatusCode());
		return stringResponseEntity.getBody();
//		return "ok";
	}

	@PostMapping("/rest")
	@ResponseBody
	public String inva() {
		return "okok";
	}
}
