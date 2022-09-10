package com.demo.mainClient;

import java.util.List;

import com.demo.entity.Product;
import com.demo.poroductdao.ProductDao;
import com.demo.poroductdaoimpl.ProductDaoImpl;

public class MainClient {

public static void main(String ar[]) {
	
	Product p1 = new Product("sumasung","red");
	
	ProductDao l = new ProductDaoImpl();
	//insert
	//l.addProductDetails(p1);
	System.out.println("inserted...");
	 //get
	//Product result =l.getProductDetailsById(1);
	
//	System.out.println(result.getName());
//	System.out.println(result.getColor());
	
	Product dbs = new Product("dbs","blackandred");
	
//	l.updateProducDetails(dbs, 1);//updated by id
	
	System.out.println("end..");
	
	//String deletedrecored =l.deleteProductById(1);
	
	//if(deletedrecored!="") {
		
	//	System.out.println("deleted");
	//}else {
	//	System.out.println(" not deleted");
	//}
	
   List<Product> productList= l.getProductList();
   
   for(Product prdt : productList){
		System.out.println("List of Products::"+prdt.getId()+","+prdt.getName()+""+prdt.getColor());
	}
	
}

}
