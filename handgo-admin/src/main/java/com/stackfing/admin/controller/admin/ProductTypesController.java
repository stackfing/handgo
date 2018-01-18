//package com.stackfing.admin.controller.admin;
//
//import com.stackfing.admin.pojo.TreeRoot;
//import com.stackfing.admin.service.ProductTypeService;
//import com.stackfing.common.utils.HandgoResult;
//import com.stackfing.pojo.ProductCategory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@Controller
//@RequestMapping("/admin/types")
//public class ProductTypesController {
//
//	@Autowired
//	private ProductTypeService productTypeService;
////
////	@GetMapping("")
////	public String types(ModelMap modelMap) {
////		List<ProductCategory> allType = productTypeService.findAllType();
////		modelMap.put("allType", allType);
////		return "admin/types";
////	}
//
//	@GetMapping({"/",""})
//	public String toType() {
//		return "admin/types";
//	}
//
//	@GetMapping("/list")
//	@ResponseBody
//	public List<TreeRoot> getALlRoot() {
//		return productTypeService.getTypesTree();
//	}
//
//	@GetMapping("/{id}")
//	@ResponseBody
//	public ProductCategory getTypeById(@PathVariable Long id) {
//		return productTypeService.selectTypeById(id);
//	}
//
//	@PostMapping("/update")
//	@ResponseBody
//	public HandgoResult updateType(@RequestBody ProductCategory productCategory) {
//		System.out.println(productCategory);
//		return productTypeService.updateType(productCategory);
//	}
//
//}
