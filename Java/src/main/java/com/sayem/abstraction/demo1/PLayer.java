package com.sayem.abstraction.demo1;

public class PLayer extends GameObject{


    @Override
    public void draw() {
        System.out.println("Player draw");
    }

    public void someMethod(){
        System.out.println("Some method");
    }
}
