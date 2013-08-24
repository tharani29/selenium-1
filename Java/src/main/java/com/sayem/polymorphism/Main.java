package com.sayem.polymorphism;

public class Main {

    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();

        cat.talk();
        dog.talk();
    }
}
