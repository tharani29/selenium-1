package com.sayem.javadirect2you.singleton;

public class SingletonTest {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        instance.printHelloWorld();
    }
}
