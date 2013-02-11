package com.sayem.input;
import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		double fNum , sNum , result ;
		
		Scanner input = new Scanner(System.in) ;
		
		System.out.println("Masukkan angka pertama : ");
		fNum = input.nextDouble() ;
		
		System.out.println("Masukkan angka kedua: ");
		sNum = input.nextDouble() ;
		
		result = fNum + sNum;
		System.out.println("Hasilnya adalah : " + result);
	}
	
}
