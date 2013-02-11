package com.sayem.enumeration;

import java.util.EnumSet;

public class Main {

	public static void main(String[] args) {
		for(Mahasiswa value : Mahasiswa.values())
			System.out.printf("%s\t%s\t%s\n", value,value.getDesc(),value.getAge() );
		
			System.out.println("This is sample enum set range");
		for (Mahasiswa object : EnumSet.range(Mahasiswa.fanani, Mahasiswa.dina))
			System.out.printf("%s\t%s\t%s\n", object,object.getDesc(),object.getAge() );
	}
	
}
