//package com.stackfing.admin.service.serviceImpl;
//
//import com.stackfing.admin.mapper.ProductTypeMapper;
//import com.stackfing.admin.pojo.TreeRoot;
//import com.stackfing.admin.service.ProductTypeService;
//import com.stackfing.common.utils.HandgoResult;
//import com.stackfing.pojo.ProductCategory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@Service
//public class ProductTypeServiceImpl implements ProductTypeService {
//
//    @Autowired
//    private ProductTypeMapper productTypeMapper;
//
//    @Override
//    public List<ProductCategory> findAllType() {
//        return productTypeMapper.findAll();
//    }
//
//	@Override
//	public List<ProductCategory> selectAllRoot() {
//		return productTypeMapper.selectAllRoot();
//	}
//
//	@Override
//	public List<ProductCategory> selectAllChildrenByParentId(Long id) {
//		return productTypeMapper.selectAllChildrenByParentId(id);
//	}
//
//	@Override
//	public ProductCategory selectTypeById(Long id) {
//		return productTypeMapper.selectTypeById(id);
//	}
//
//	@Override
//	public List<TreeRoot> getTypesTree() {
//
//		List<TreeRoot> treeRoot = new ArrayList<TreeRoot>();
//
//		List<ProductCategory> list = selectAllRoot();
//
//		for (ProductCategory root :
//				list) {
//
//			TreeRoot t = new TreeRoot();
//
//			t.setName(root.getName());
//
//			t.setId(root.getId());
//
//			List<ProductCategory> productCategory = selectAllChildrenByParentId(root.getId());
//
//			t.setChildren(productCategory);
//
//			treeRoot.add(t);
//		}
//		return treeRoot;
//	}
//
//	@Override
//	public HandgoResult updateType(ProductCategory productCategory) {
//    	if (productTypeMapper.updateType(productCategory) == 1){
//			return new HandgoResult().ok("ok");
//		}
//		return new HandgoResult().faild("faild");
//	}
//}
