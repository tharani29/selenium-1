package com.sayem.method;

public class Main {
	public static void main(String[] args) {
		VoidMethod voidMethod = new VoidMethod();
		ReturnMethod returnMethod = new ReturnMethod() ;
		
		voidMethod.BelajarMethod();
		System.out.println(returnMethod.pesan("Hi Guys ! "));
	}
}
