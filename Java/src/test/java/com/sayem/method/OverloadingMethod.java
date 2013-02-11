package com.sayem.method;

public class OverloadingMethod {
	public static void main(String[] args) {
		OverloadingMethod object = new OverloadingMethod();
		object.sayHello("Fanani ") ;
		object.sayHello("Fanani", "Selamat Balajar java") ;
	}
	
	public void sayHello(String name){
		System.out.println("Hello " + name);
	}
	
	public void sayHello(String name , String message ){
		System.out.println("Hello   : " + name);
		System.out.println("Message : " + message);
	}
}
