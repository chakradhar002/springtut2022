package com.demo.daoimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.demo.dao.ProductDao;
import com.demo.entity.Product;
import com.demo.repo.ProductRepo;

@Component
public class ProductDAOImpl implements ProductDao {
	// inject the dependency of repository interface into dao impl
	@Autowired
	ProductRepo productRepo;

	@Override
	public Product addProductDetails(Product product) {
		
		Product result = productRepo.save(product);
		
		return result;
	}

}
