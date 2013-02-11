	package com.sayem.geetersetter;
	
	public class Mahasiswa {
		private String name ;
		
		public void setName(String tmp){
			name = tmp ;
		}
		
		public String getName(){
			return name ;
		}
		
		public void sayHello(){
			System.out.println("Hello " + getName());
		}
	}
