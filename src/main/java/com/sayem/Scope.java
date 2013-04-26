package com.sayem;

public class Scope {
    public static void main(String[] args) {
        int x; // known to all code withing main

        x = 10;
        if (x == 10){
            int y = 20; // known only to this block

            // x and y both known here
            System.out.println("x and y: " + x + " " + y);
            x = y * 2;
        }

        // x is still known here.
        System.out.println("x is " + x);
    }
}
