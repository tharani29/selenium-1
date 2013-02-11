package com.sayem.inheritance;

public class Manusia {
	private String name ;
	private String address ;
	private int height ;
	private int weight ;
	
	
	Manusia(String name, String address, int height, int weight) {
		super();
		this.name = name;
		this.address = address;
		this.height = height;
		this.weight = weight;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public void sayHello(){
		System.out.println("Hello " + getName());
	}
	
	
}
