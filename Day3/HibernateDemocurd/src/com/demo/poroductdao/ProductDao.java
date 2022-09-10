package com.demo.poroductdao;

import com.demo.entity.Product;

public interface ProductDao {
	//add product
 	Product addProductDetails(Product product);
 	//get product by id
 	Product getProductDetailsById(long id);
 	//
 	Product updateProducDetails(Product product,long id);
 	
 	//delete by id
 	String deleteProductById(long id);

}
