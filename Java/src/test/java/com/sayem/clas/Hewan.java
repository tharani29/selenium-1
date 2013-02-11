package com.sayem.clas;

public class Hewan {
	int age ;
	float weight;
	float  height;
	String color ;
	
	public void sleep(){
		System.out.println("Have a nice dream !");
	}
	
	public String speak(String word){
		String response = "I say , " + word ;
		return response;
	}
	
	public static void main(String[] args) {
		Hewan kucing = new Hewan();
		kucing.sleep();
		System.out.println(kucing.speak("Meong") + " !");
	}
	
}
