package com.sayem.tostring;

public class Mahasiswa {
	private String nim ;
	private String name ;
	
	Mahasiswa(String nim, String name) {
		this.nim = nim;
		this.name = name;
		System.out.println(this);
	}
	
	
	public String toString(){
		return String.format("NIM\t : %s\nName\t : %s", nim,name) ;
	}

}
