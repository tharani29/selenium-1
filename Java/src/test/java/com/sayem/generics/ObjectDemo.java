package com.sayem.generics;

public class ObjectDemo {
	public static void main(String[] args) {
		Box intBox = new Box();
		Box strBox = new Box();
		
		intBox.add(new Integer(10)) ;
		Integer someInt = (Integer) intBox.get();
		System.out.println(someInt);
		
		strBox.add(new String("Fanani")) ;
		String name = (String) strBox.get();
		System.out.println(name);
	}
}
