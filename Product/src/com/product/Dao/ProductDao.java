package com.product.Dao;

import java.util.List;

import com.product.bean.ProductBean;

public interface ProductDao {
	void AddProduct();
	List<ProductBean>viewProduct();
	void ViewSpecificProduct(int pid);
	void UpdateProduct(int pid);
	void DeleteProduct(int pid);

}
