package com.stackfing.handgo.controller.admin;

import com.stackfing.handgo.entity.ProductType;
import com.stackfing.handgo.service.ProductTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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
	public String getType() {
		return "[{ \n" +
				"    name: 'asd'\n" +
				"    ,children: [{\n" +
				"      name: 'asd'\n" +
				"    }]\n" +
				"  }, {\n" +
				"    name: 'asd'\n" +
				"    ,children: [{\n" +
				"      name: 'asd'\n" +
				"      ,alias: 'bb' \n" +
				"      ,id: '123' \n" +
				"    }, {\n" +
				"      name: 'sdf'\n" +
				"    }]\n" +
				"  }] ";
	}
}
