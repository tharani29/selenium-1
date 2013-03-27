package com.sayem.generics.simple_generic;

public class Gen <T> {

    T ob; // declare an object of type T

    // Pass the constructor a reference to
    // an object of type T

    public Gen(T ob) {
        this.ob = ob;
    }

    // Return ob.
    public T getOb() {
        return ob;
    }

    // Show type of T.
    public void showType(){
        System.out.println("Type of T is " + ob.getClass().getSimpleName());
    }
}
