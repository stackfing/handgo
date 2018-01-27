package com.stackfing.front.controller;

import com.stackfing.common.service.ProductService;
import com.stackfing.common.vo.ProductVo;
import com.stackfing.pojo.Product;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @Author: fing
 * @Description:
 * @Date: 下午1:58 18-1-26
 */

@Controller
public class ProductController {

	@Autowired
	private ProductService productService;

	@GetMapping("/product/{id}")
	public String productDetail(@PathVariable Long id, Model model) {
		Product product = productService.getProductById(id);
		ProductVo productVo = new ProductVo();
		BeanUtils.copyProperties(product, productVo);
		productVo.setDescription("\n" +
				"\t\t\t\t\t\t\t\t\t\t\t<img src=\"../images/tw1.jpg\">\n" +
				"\t\t\t\t\t\t\t\t\t\t\t<img src=\"../images/tw2.jpg\">\n" +
				"\t\t\t\t\t\t\t\t\t\t\t<img src=\"../images/tw3.jpg\">\n" +
				"\t\t\t\t\t\t\t\t\t\t\t<img src=\"../images/tw4.jpg\">\n" +
				"\t\t\t\t\t\t\t\t\t\t\t<img src=\"../images/tw5.jpg\">\n" +
				"\t\t\t\t\t\t\t\t\t\t\t<img src=\"../images/tw6.jpg\">\n" +
				"\t\t\t\t\t\t\t\t\t\t\t<img src=\"../images/tw7.jpg\">");
		model.addAttribute("product", productVo);
		return "home/product-detail";
	}

}
