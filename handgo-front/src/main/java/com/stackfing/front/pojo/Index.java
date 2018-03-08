package com.stackfing.front.pojo;

import com.stackfing.pojo.Category;
import com.stackfing.pojo.Notice;
import com.stackfing.pojo.Product;
import lombok.Data;

import java.util.List;

/**
 * @Author: fing
 * @Description:
 * @Date: 下午7:13 18-2-17
 */

@Data
public class Index {

	List<Product> killProductList;

	List<Category> killCategoryList;

	List<Notice> noticeList;

}
