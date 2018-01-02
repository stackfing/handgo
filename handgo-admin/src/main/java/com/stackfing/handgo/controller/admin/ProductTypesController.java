package com.stackfing.handgo.controller.admin;

import com.stackfing.handgo.entity.Product;
import com.stackfing.handgo.entity.ProductType;
import com.stackfing.handgo.pojo.TreeRoot;
import com.stackfing.handgo.service.ProductTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
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

	@GetMapping("/getTypes")
	@ResponseBody
	public List<TreeRoot> getType() {
		List<TreeRoot> treeRoot = new ArrayList<TreeRoot>();

		List<ProductType> list = productTypeService.selectAllRoot();

		for (ProductType root :
				list) {
			TreeRoot t = new TreeRoot();

			t.setName(root.getName());

			List<ProductType> productType = productTypeService.selectAllChildrenByParentId(root.getId());

			t.setChildren(productType);

			treeRoot.add(t);
		}

		return treeRoot;
	}
}
