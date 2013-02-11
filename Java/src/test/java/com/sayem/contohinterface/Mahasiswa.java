package com.sayem.contohinterface;

public class Mahasiswa implements Display{
	public static void main(String[] args) {
		Mahasiswa fanani = new Mahasiswa();
		fanani.setName("Fanani M. Ihsan") ;
		fanani.showName();
		
		Mahasiswa rudi = new Mahasiswa();
		rudi.setName("Ihsan") ;
		rudi.showName();
		
		System.out.println(Mahasiswa.getMember());
	}
	
	private String name ;
	private static int member = 0 ;
	
	@Override
	public void showName() {
		System.out.println("Name : " + name);
		member++;
		
	}

	@Override
	public int jumlahMember(int a) {
		// TODO Auto-generated method stub
		return member;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static int getMember() {
		return member;
	}

	public static void setMember(int member) {
		Mahasiswa.member = member;
	}

}
