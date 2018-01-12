package com.stackfing.admin.controller.admin;

import com.stackfing.admin.pojo.TreeRoot;
import com.stackfing.admin.service.ProductTypeService;
import com.stackfing.common.utils.HandgoResult;
import com.stackfing.pojo.ProductType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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

	@GetMapping({"/",""})
	public String toType() {
		return "admin/types";
	}

	@GetMapping("/list")
	@ResponseBody
	public List<TreeRoot> getALlRoot() {
		return productTypeService.getTypesTree();
	}

	@GetMapping("/{id}")
	@ResponseBody
	public ProductType getTypeById(@PathVariable Long id) {
		return productTypeService.selectTypeById(id);
	}

	@PostMapping("/update")
	@ResponseBody
	public HandgoResult updateType(@RequestBody ProductType productType) {
		System.out.println(productType);
		return productTypeService.updateTypeById(productType);
	}


//	@PostMapping("")
//	@ResponseBody
//	public String updateType(@RequestBody ProductType productType) {
//		return "ok";
//	}


//	@GetMapping("/allRoot")
//	public List<ProductType> getAllRoot() {
//		List<ProductType> productTypes = productTypeService.selectAllRoot();
//
//
//
//		return productTypes;
//	}

}
