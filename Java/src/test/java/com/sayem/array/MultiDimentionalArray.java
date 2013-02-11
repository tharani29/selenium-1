package com.sayem.array;

public class MultiDimentionalArray {
	
	public static void main(String[] args) {
		int firstArray [][]= {{1,2,3},{10,11,12},{20,21,22}};
		display(firstArray);
	}

	
	public static void display(int x[][]){
		for (int row = 0 ; row<x.length ; row++){
			for (int coloumn = 0 ; coloumn<x[row].length ; coloumn++){
				System.out.print(x[row][coloumn] + "\t");
			}
			System.out.println();
		}
	}
}
