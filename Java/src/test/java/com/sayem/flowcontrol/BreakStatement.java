package com.sayem.flowcontrol;

public class BreakStatement {
	public static void main(String[] args) {
		BreakStatement object = new BreakStatement();
		object.displayNumber();
	}
	
	void displayNumber(){
		for (int a=1 ; a<10 ; a++){
			if (a==5) break;
			System.out.print(a+",");
		}
		System.out.println("Looping selesai");
	}
}
