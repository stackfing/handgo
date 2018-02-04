package com.stackfing.admin.controller.restController;

import com.stackfing.common.service.ProductService;
import com.stackfing.common.vo.LayuiVo;
import com.stackfing.common.vo.ProductVo;
import com.stackfing.common.enums.ResultCode;
import com.stackfing.common.utils.Result;
import com.stackfing.pojo.Product;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author: fing
 * @Description:
 * @Date: 上午10:42 18-1-26
 */
@RestController
@RequestMapping("/v1/product")
public class ProductRestController {

	@Autowired
	private ProductService productService;

	@ApiOperation("获得产品列表")
	@GetMapping("")
	public LayuiVo getProductList(@RequestParam(required = false) Integer page
		, @RequestParam(required = false) Integer limit, HttpServletRequest request ,HttpServletResponse res) {
		//TODO layuiVO 返回 大小
		LayuiVo layuiVo = new LayuiVo();
		if (null == page && null == limit) {
			//如果没有填入参数，则不分页
			layuiVo.setTotal(10);
			layuiVo.setCode(ResultCode.SUCCESS);
			layuiVo.setData(productService.getProductList());
			System.out.println(request.getHeader("Set-Cookie") + "---------------------------");
			res.addHeader("Set-Cookie", "uid=112; Path=/; HttpOnly");
			res.addHeader("Admins", "admin");
			return layuiVo;
//			return LayuiVo.success(productService.getProductList());
		}
		//分页
		layuiVo.setData(productService.getProductList(page, limit));
		layuiVo.setTotal(10);
		layuiVo.setCode(ResultCode.SUCCESS);
//		res.addHeader("refresh","1");
		return layuiVo;
//		return Result.success(productService.getProductList(page, limit));
	}

	@ApiOperation("添加产品")
	@PostMapping("")
	public Result save(@RequestBody ProductVo vo) {
		return Result.success(productService.createProduct(vo, vo.getDescription()));
	}

	@ApiOperation("根据 ID 查询产品")
	@GetMapping("/{id}")
	public Result getProductById(@PathVariable Long id) {
		ProductVo productVo = new ProductVo();
		BeanUtils.copyProperties(productService.getProductById(id), productVo);
		return Result.success(productVo);
	}

	@ApiOperation("更新产品")
	@PutMapping("/{id}")
	public Result update(@PathVariable Long id, @RequestBody ProductVo productVo) {
		Product product = productService.updateProductById(id, productVo);
		if (product == null) {
			return Result.success("更新成功");
		}
		return Result.error("更新失败");
	}

	@ApiOperation("删除产品")
	@DeleteMapping("/{id}")
	public Result delete(@PathVariable Long id) {
		int i = productService.deleteById(id);
		if (1 == i) {
			return Result.success("删除成功");
		}
		return Result.error("删除失败");
	}
}
