package com.demo.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.ProductDao;
import com.demo.entity.Product;
import com.demo.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductDao ProductDao;

	@Override
	public Product addProductService(Product Product) {

		return ProductDao.addProductDetails(Product);
	}

}
