package com.sayem.thinking_in_java;

public class Casting {
    public static void main(String[] args) {
        int i = 200;
        long lng = (long) i;
        lng = i;
        long lng2 = (long) 200;
        lng2 = 200;

        i = (int)lng2;
    }
}
