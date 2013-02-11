package com.sayem.constructor;

public class Mahasiswa2 {
	private String nim ;
	private String name ;
	
	public Mahasiswa2(){
	}
	public Mahasiswa2(String nim){
		this.nim = nim ;
	}
	
	public Mahasiswa2(String nim , String name){
		this.nim = nim  ;
		this.name = name ;
	}
	public String getNim() {
		return nim;
	}
	public void setNim(String nim) {
		this.nim = nim;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void displayMhs(){
		System.out.println("NIM  : " + getNim());
		System.out.println("Name : " + getName());
	}
	
}
