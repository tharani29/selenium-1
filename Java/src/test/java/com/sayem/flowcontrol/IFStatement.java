package com.sayem.flowcontrol;
import java.util.Scanner;

public class IFStatement {
	
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in) ;
		String grade ;
		double nilai ;
		
		System.out.print("Masukkan nilai ujian : ");
		nilai = input.nextDouble() ;
		
		if(nilai<=70){
			grade = "Cukup" ;
		} else if(nilai<=80){
			grade = "Baik" ;
		}else if (nilai <=90){
			grade = "Baik Sekali";
		} else if (nilai <= 100){
			grade = "Sempurna" ;
		}
		else{
			grade = "Error ! Maximal input 100 " ;
		}
		
		System.out.println("Nilai    = "+ nilai);
		System.out.println("Predikat = " + grade);
	}
}
