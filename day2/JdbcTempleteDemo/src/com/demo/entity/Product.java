package com.demo.entity;

public class Product {
	
	private long id;
	private String name;
	private String color;
	
	public Product() {
		
		System.out.println("default...");
	}
	
	public Product( String name, String color) {

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

}
