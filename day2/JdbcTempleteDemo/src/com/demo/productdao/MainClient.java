package com.demo.productdao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.entity.Product;

public class MainClient {

	public static void main(String[] args) {
	
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("bean.xml");
		
		ProductDao productdao = (ProductDao) ctx.getBean("myprod");
		
		int status = productdao.saveProduct(new Product("mi","red"));
		
		if(status!=0) {
			
			System.out.println("inserted");
		}else {
			
			System.out.println(" not inserted");
		}

	}

}
