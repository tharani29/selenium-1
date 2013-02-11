package com.sayem.flowcontrol;

public class ContinueStatement {
	public static void main(String[] args) {
		ContinueStatement object = new ContinueStatement();
		object.displayNumber();
	}
	
	void displayNumber(){
		for (int a=1 ; a<10 ; a++){	
			if(a==5) continue ;
			System.out.print(a+",");
		}
		System.out.println("Looping selesai");
	}
}
