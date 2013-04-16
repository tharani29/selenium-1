package com.sayem.thinking_in_java;

import java.util.Random;

public class Bool {
    public static void main(String[] args) {
        Random rand = new Random(47);
        int i = rand.nextInt(100);

        int j = rand.nextInt(100);
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("i > j is " + (i > j));
        System.out.println("i < j is " + (i < j));
        System.out.println("i >= j is " + (i >= j));
        System.out.println("i <= j is " + (i <= j));
        System.out.println("i == j is " + (i == j));
        System.out.println("i != j is " + (i != j));

        // Treating an int as a boolean is not legal in Java:
        //System.out.println("i && j is " + (i && j));
        //System.out.println("i || j is " + (i || j));
        //System.out.println("!i is " + !i);


    }

}
