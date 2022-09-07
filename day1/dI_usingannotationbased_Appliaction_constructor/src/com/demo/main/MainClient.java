package com.demo.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.demo.bean.Product;
import com.demo.config.AppConfig;

public class MainClient {

	public static void main(String[] args) {

		ApplicationContext c = new AnnotationConfigApplicationContext(AppConfig.class);

		Product p = (Product) c.getBean(Product.class);
        p.setName("samsung");

		p.show();


	}

}
