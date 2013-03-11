package com.sayem.arrays.arrays.part2;


import java.util.Arrays;

public class CompareCharArraysExample {

    public static void main(String [] args){

        char[] charArray1 = new char[]{'d', 'h', 'r', 'f'};
        char[] charArray2 = new char[]{'d', 'h', 'r', 'f'};

        boolean blnResult = Arrays.equals(charArray1, charArray2);
        System.out.println("Are two char arrys equal ? " + blnResult);

    }
}
