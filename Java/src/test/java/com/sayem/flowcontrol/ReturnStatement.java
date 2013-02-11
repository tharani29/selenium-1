package com.sayem.flowcontrol;

public class ReturnStatement {
	public static void main(String[] args) {
		ReturnStatement object = new ReturnStatement();
		object.displayNumber();
	}
	
	void displayNumber(){
		for (int a=1 ; a<10 ; a++){	
			if(a==5) return ;
			System.out.print(a+",");
		}
		System.out.println("Looping selesai");
	}
	
}
