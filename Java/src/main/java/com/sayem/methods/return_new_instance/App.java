package com.sayem.methods.return_new_instance;


import com.sayem.multithreading.demo1.Runner;

public class App {
    public static void main(String [] args){

        Runner runner1 = new Runner();
        runner1.start();

        Runner runner2 = new Runner();
        runner2.start();

    }
}
