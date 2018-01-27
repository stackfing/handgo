package com.stackfing.front.controller;

import com.stackfing.common.service.CategoryService;
import com.stackfing.common.service.FrontCommendService;
import com.stackfing.common.service.KillProductService;
import com.stackfing.common.service.NoticeService;
import com.stackfing.common.vo.NoticeVo;
import com.stackfing.common.vo.ProductVo;
import com.stackfing.front.vo.*;
import com.stackfing.pojo.Category;
import com.stackfing.pojo.KillProduct;
import com.stackfing.pojo.Notice;
import com.stackfing.pojo.Product;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import sun.font.FontConfigManager;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: fing
 * @Description:
 * @Date: 下午1:46 18-1-26
 */

@Controller
public class IndexController {

	@Autowired
	private KillProductService killProductService;

	@Autowired
	private CategoryService categoryService;

	@Autowired
	private NoticeService noticeService;

	@Autowired
	private FrontCommendService frontCommendService;

	@GetMapping("")
	public String index(ModelMap modelMap, HttpServletRequest request) {
		String username = (String) request.getSession().getAttribute("username");
		modelMap.put("username", username);
		modelMap.put("killList", killProductService.productList());
		modelMap.put("categorys", categoryService.getCategoryParent());
		modelMap.put("Notices", noticeService.getNoticeList());
		modelMap.put("commendList", getFrontCommendVoList());
//		System.out.println(getFrontCommendVoList().toString());
//		System.out.println(noticeService.getNoticeList());
//		System.out.println(categoryService.getCategoryParent().toString());
		return "home/home2";
	}

	private List<FrontCommendVo> getFrontCommendVoList() {
		List<Category> categoryList = frontCommendService.getFrontCategory();
		List<FrontCommendVo> list = new ArrayList<>();
		for (Category c : categoryList) {
			FrontCommendVo frontCommendVo = new FrontCommendVo();
			frontCommendVo.setTitle(c.getName());
			frontCommendVo.setSubtitle("abc");
			List frontCategoryVoList = new ArrayList();
			List<Category> categories = frontCommendService.subCommendCategory(c.getId());
			for (Category t : categories) {
				FrontCategoryVo vo = new FrontCategoryVo();
				vo.setName(t.getName());
				vo.setId(t.getId());
				frontCategoryVoList.add(vo);
			}
			frontCommendVo.setCategoryList(frontCategoryVoList);
			List frontProductVolist = new ArrayList();
			List<Product> products = frontCommendService.starProduct(c.getId());
			for (Product product : products) {
				FrontProductVo vo = new FrontProductVo();
				vo.setId(product.getId());
				vo.setPhoto(product.getPhotos());
				vo.setTitle(product.getName());
				vo.setPrice(product.getCurrentPrice());
				frontProductVolist.add(vo);
			}

			frontCommendVo.setStarProduct(frontProductVolist);
			list.add(frontCommendVo);
		}

		return list;
	}

	@GetMapping("/notice")
	@ResponseBody
	public List<Notice> notice() {
		return noticeService.getNoticeList();
	}

	@GetMapping("/home")
	public String home(HttpServletRequest request) {
		return "person/index";
	}

	@GetMapping("/shopcart")
	public String shopCart() {
		return "home/shopcart";
	}

	@GetMapping("/collection")
	public String collection() {
		return "person/collection";
	}

	@GetMapping("/v1/category/{id}")
	@ResponseBody
	public CategoryVo getSubCategory(@PathVariable Long id) {
		List<Category> subCategoryById = categoryService.getSubCategoryById(id);
		CategoryVo vo = new CategoryVo();
		vo.setName(categoryService.getCategoryById(id).getName());
		vo.setSubCategories(subCategoryById);
		return vo;
	}
}
