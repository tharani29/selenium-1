package com.sayem.multithreading.demo2;

public class App {

    public static void main(String [] args){

        Thread t1 = new Thread(new Runner());
        Thread t2 = new Thread(new Runner());

        t2.start();
        t1.start();
    }
}
