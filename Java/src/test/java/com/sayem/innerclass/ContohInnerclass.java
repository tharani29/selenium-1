package com.sayem.innerclass;

public class ContohInnerclass {
	int a = 10 ;
	class Innerclass{
		int b = 20 ;
		void method(){
			System.out.println(a);
			System.out.println(b);
		}
	}
	
	public static void main(String[] args) {
		ContohInnerclass p = new ContohInnerclass();
		Innerclass in = p.new Innerclass();
		System.out.println(p.a);
		System.out.println(in.b);
		
		in.method();
		
		
	}
}
