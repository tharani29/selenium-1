package com.sayem.input;

import java.util.Scanner;

public class UserInputHello {
	public static void main(String[] args) {
		System.out.print("Pleas input here : " );
		Scanner input = new Scanner(System.in) ;
		System.out.println("Yout input is " + input.nextLine());
	}
}
