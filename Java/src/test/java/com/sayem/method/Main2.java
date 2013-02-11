package com.sayem.method;
import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String name ;
		SayHello hello = new SayHello();
		
		System.out.print("Input name : ");
		name = input.nextLine();
		hello.haiMethod(name);
		
	}
} 