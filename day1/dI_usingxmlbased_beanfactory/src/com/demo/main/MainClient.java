package com.demo.main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.demo.bean.Product;

public class MainClient {

	public static void main(String[] args) {

		// creating IOc  container using bean fatory
          Resource r = new ClassPathResource("bean.xml");
          
          BeanFactory f = new  XmlBeanFactory(r);

		  Product p = (Product) f.getBean("mybean");

		p.show();
	
	}

}
