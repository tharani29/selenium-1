package com.sayem.tostring;

public class BelajarToString {
	int day ;
	int month ;
	int year ;
	
	public BelajarToString(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
		
		System.out.printf("Date : %s", this);
	}

	public String toString(){
		return String.format("%d/%d/%d \n", day,month,year) ;
	}
	
}
