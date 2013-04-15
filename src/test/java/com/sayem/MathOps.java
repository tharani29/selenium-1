package com.sayem;

import java.util.Random;

public class MathOps {

    public static void main(String[] args) {
        // Create a seeded random number generator:

        Random rand = new Random();
        int i, j, k;

        // Choose value from 1 tp 100;
        j = rand.nextInt(100) + 1;
        System.out.println("j : " + j);
    }
}
