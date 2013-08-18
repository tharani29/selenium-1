package com.sayem.javadirect2you.singleton;

public class Singleton {

    private static Singleton instance;

    private Singleton(){
        // private constructor
    }

    public synchronized static Singleton getInstance(){
        if (instance == null){
            instance = new Singleton();
        }
        return instance;
    }

    public void printHelloWorld(){
        System.out.println("Hello World!");
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }
}
