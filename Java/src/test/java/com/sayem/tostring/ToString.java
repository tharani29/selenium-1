package com.sayem.tostring;

public class ToString {
	private String name ;
	private int day ;
	private int month ;
	private int year ;
	
	public ToString(String name, int day, int month, int year) {
		super();
		this.name = name;
		this.day = day;
		this.month = month;
		this.year = year;
		System.out.println(this);
	}
	
	public String toString(){
		return String.format("%s's birthday Is %d/%d/%d", name,day,month,year) ;
	}
	
}
