package com.sayem.javadirect2you.singleton;

public class SingletonDemo {

    private static SingletonDemo instance;

    private SingletonDemo(){
        // private constructor
    }

    public static SingletonDemo getInstance(){
        if (instance == null){
            instance = new SingletonDemo();
        }
        return instance;
    }
}
