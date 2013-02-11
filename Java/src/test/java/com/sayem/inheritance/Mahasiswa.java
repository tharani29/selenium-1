package com.sayem.inheritance;

public class Mahasiswa extends Manusia {
	private String nim ;

	Mahasiswa(String name, String address, int height, int weight,
			String nim) {
		super(name, address, height, weight);
		this.nim = nim;
		System.out.println("Nim    : " + nim);
		System.out.println("Name   : " + name);
		System.out.println("Height : " + address);
		System.out.println("Height : " + height);
		System.out.println("Weight : " + weight);
		}

	public String getNim() {
		return nim;
	}

	public void setNim(String nim) {
		this.nim = nim;
	}
	
	public void sayHello(){
		System.out.println("Hello  " + getName() +"! Nim Anda " + getNim());
	}
	
}
