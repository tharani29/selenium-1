package com.sayem.exception;

public class DivByZero {
	public static void main(String[] args) {
		int a = 10 ;
		try {
			System.out.println(a/0);
		} catch (Exception e) {
			System.out.println("Terjadi kesalahan : " + e);
		}
	}
}
