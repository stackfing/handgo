package com.stackfing.handgo.controller.admin;

import com.stackfing.handgo.entity.Product;
import com.stackfing.handgo.entity.ProductType;
import com.stackfing.handgo.pojo.TreeRoot;
import com.stackfing.handgo.service.ProductTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import sun.reflect.generics.tree.Tree;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/admin/types")
public class ProductTypesController {

	@Autowired
	private ProductTypeService productTypeService;
//
//	@GetMapping("")
//	public String types(ModelMap modelMap) {
//		List<ProductType> allType = productTypeService.findAllType();
//		modelMap.put("allType", allType);
//		return "admin/types";
//	}

	@GetMapping("/types")
	public String toType() {
		return "admin/types";
	}

	@GetMapping("/allRoot")
	@ResponseBody
	public List<TreeRoot> getALlRoot() {
		return productTypeService.getTypesTree();
	}

	@GetMapping("/{id}")
	@ResponseBody
	public ProductType getTypeById(@PathVariable Long id) {
		return productTypeService.selectTypeById(id);
	}

	@PostMapping("")
	@ResponseBody
	public String updateType(@RequestBody ProductType productType) {
		return "ok";
	}


//	@GetMapping("/allRoot")
//	public List<ProductType> getAllRoot() {
//		List<ProductType> productTypes = productTypeService.selectAllRoot();
//
//
//
//		return productTypes;
//	}

}
