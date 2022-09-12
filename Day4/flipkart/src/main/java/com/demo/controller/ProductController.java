package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.entity.Product;
import com.demo.service.ProductService;

@RestController
@RequestMapping(value = "/productmoduleinfo")
public class ProductController {

	@Autowired
	ProductService productService;

	@PostMapping(value = "/addproduct")
	Product createProductByAdmin(@RequestBody Product product) {

		Product result = productService.addProductService(product);
		return result;

	}

}
