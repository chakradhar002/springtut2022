package com.demo.main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.bean.Product;

public class MainClient {

	public static void main(String[] args) {

		// creating IOc
		ApplicationContext c = new ClassPathXmlApplicationContext("bean.xml");

		Product p = (Product) c.getBean("mybean");

		p.show();

	}

}
