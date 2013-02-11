package com.sayem.enumeration;

public enum Mahasiswa {
	fanani("cool","21"),
	rudi("Sporty","20"),
	dina("Cute","19");
	
	private final String desc ;
	private final String age ;
	
	

	Mahasiswa(String desc, String age) {
		this.desc = desc;
		this.age = age;
	}

	public String getDesc() {
		return desc;
	}

	public String getAge() {
		return age;
	}
	
	
	
}
