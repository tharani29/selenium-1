package com.sayem.constructor;

public class Mahasiswa {
	String nim ;
	String nama ;
	
	public Mahasiswa(String tmpNim , String tmpName){
		nim = tmpNim ;
		nama = tmpName ;
	}

	public String getNim() {
		return nim;
	}

	public void setNim(String nim) {
		this.nim = nim;
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}
	
	public void getInfo(){
		System.out.println("----------------------------");
		System.out.println("Nim  : " + getNim());
		System.out.println("Nama : " + getNama());
	}
	
	
}
