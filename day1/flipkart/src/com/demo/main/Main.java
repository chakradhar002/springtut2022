package com.demo.main;

import com.demo.entity.Product;

public class Main {

	public static void main(String[] args) {
		
		
		///UI
		Product p =new Product();
		p.setId(101);
		p.setName("iphone");
		p.setColor("red");
		
		
		System.out.println(p.getId());
		p.setId(102);
		System.out.println(p.getId());
		
	}

}
