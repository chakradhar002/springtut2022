package com.demo.bean;

public class Product {
	// these attributes are called properties
	private long id;
	private String name;
	private String color;
	
	
	public Product() {
		System.out.println("defalut");
		
	}
	public Product(long id, String name, String color) {

		this.id = id;
		this.name = name;
		this.color = color;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	// user define method

	public void show() {
		System.out.println(" id " + id);
		System.out.println(" name " + name);
		System.out.println(" color " + color);
	}



}
