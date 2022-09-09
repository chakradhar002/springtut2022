package com.demo.mainClient;

import com.demo.entity.Product;
import com.demo.poroductdao.ProductDao;
import com.demo.poroductdaoimpl.ProductDaoImpl;

public class MainClient {

public static void main(String ar[]) {
	
	Product p1 = new Product("sumasung","red");
	
	ProductDao l = new ProductDaoImpl();
	l.addProductDetails(p1);
	System.out.println("inserted...");
	
}

}
