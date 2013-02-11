package com.sayem.flowcontrol;

import java.util.Scanner;
import java.util.Scanner;

public class SwitchStatement {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in) ;
		int numOfDay ,month , year , kabisat;
		
		System.out.print("Masukkan bulan : ");
		month = input.nextInt() ;
		
		System.out.print("Masukkan year : ");
		year = input.nextInt() ;
		
		switch (month) {
		case 1 :
		case 3 :
		case 5 :
		case 7 :
		case 8 :
		case 10:
		case 12:
			numOfDay = 31 ;
			break;
		case 4 :
		case 6 :
		case 9 :
		case 11:
			numOfDay = 30 ;
			break ;
		case 2 :
			numOfDay = 30 ;
			kabisat = year % 4 ;
			if (kabisat == 0 ){
				numOfDay = 29 ;
			} else {
				numOfDay = 28 ;
			}
			break;
		default:
			numOfDay = (Integer) null ;
			break;
		}
		System.out.println("Perhitungan bulan ... ");
		System.out.println("Bulan ke-" + month + " tahun " +year);
		System.out.println("Jumlah hari : " + numOfDay) ;
	}
}
