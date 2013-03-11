package com.sayem.arrays.arrays.part2;

import java.util.Arrays;

public class CompareByteArraysExample {

    public static void main(String [] args){

        byte[] byteArray1 = new byte[]{7, 25, 12};
        byte[] byteArray2 = new byte[]{7, 25, 15};

        boolean binResult = Arrays.equals(byteArray1, byteArray2);
        System.out.println("Are two byte array equal ? : "+ binResult);
    }
}
