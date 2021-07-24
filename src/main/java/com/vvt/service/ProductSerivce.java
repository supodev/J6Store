package com.vvt.service;

import java.util.List;
import com.vvt.entity.Product;

public interface ProductSerivce {

	List<Product> findAll();

	Product findById(Integer id);

	List<Product> findByCategoryId(String cid);

	Product create(Product product);

	Product update(Product product);

	void delete(Integer id);
	
}
