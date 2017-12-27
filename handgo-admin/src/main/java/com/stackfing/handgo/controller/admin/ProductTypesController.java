package com.stackfing.handgo.controller.admin;

import com.stackfing.handgo.entity.ProductType;
import com.stackfing.handgo.service.ProductTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/admin/types")
public class ProductTypesController {

	@Autowired
	private ProductTypeService productTypeService;

	@GetMapping("")
	public String types(ModelMap modelMap) {
		List<ProductType> allType = productTypeService.findAllType();
		modelMap.put("allType", allType);
		return "admin/types";
	}
}
