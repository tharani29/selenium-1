package com.sayem.javacompletereference.generics;

public class Gen<T> {
    T ob; // declare an object of type T

    // pass the constructor a reference to
    // an object of type T


    public Gen(T ob) {
        this.ob = ob;
    }

    public T getOb() {
        return ob;
    }

    public void showType(){
        System.out.println("Type of T is " + ob.getClass().getName());
    }
}
