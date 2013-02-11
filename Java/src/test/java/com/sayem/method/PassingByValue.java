package com.sayem.method;

public class PassingByValue {
	public static void main(String[] args) {
		int a = 10 ;
		System.out.println(a);
		
		tes(a);
		
		System.out.println(a);
		
	}
	
	static void tes(int j){
		j = 12 ;
	}
}
