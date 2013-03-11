package com.sayem.arrays.arrays.part2;

import java.util.Arrays;

public class CompareBooleanArraysExample {

    public static void main(String [] args){

        Boolean [] binArray1 = new Boolean[]{true, false, true};
        Boolean [] binArray2 = new Boolean[]{true, false, true};

        boolean binResult = Arrays.equals(binArray1, binArray2);
        System.out.println("Are two bollean arrays equa ? : " + binResult);

    }
}
