package com.sayem.generics.twotype_generics;

// A simple generic class with two type
// parameters: T and V
public class TwoGen <T, V>{
    T ob1;
    V ob2;

    // Pass the constructor a reference to
    // an object of type T and an object of type V.
    public TwoGen(T ob1, V ob2) {
        this.ob1 = ob1;
        this.ob2 = ob2;
    }

    // Show types of T and V
    public void showTypes(){
        System.out.println("Type of T is " + ob1.getClass().getSimpleName());
    }

    public T getOb1() {
        return ob1;
    }

    public V getOb2() {
        return ob2;
    }
}
