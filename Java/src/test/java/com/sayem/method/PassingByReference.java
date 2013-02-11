package com.sayem.method;

public class PassingByReference {
	
	
	public static void main(String[] args) {
		int []a= {10,11,12};
		
		for (int x=0 ; x<a.length ; x++){
			System.out.println(a[x]);
		}
		
		display(a);
		
		for (int x=0 ; x<a.length ; x++){
			System.out.println(a[x]);
		}
	}
	
	static void display(int[]j){
		for (int x = 0 ; x<j.length ;x++){
			j[x] = x+50 ;
		}
	}
}
