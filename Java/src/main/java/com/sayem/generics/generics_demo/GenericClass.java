package com.sayem.generics.generics_demo;

public class GenericClass<T> {
    T ob;

    // Constructor
    public GenericClass(T ob){
        this.ob = ob;
    }

    public T getOb() {
        return ob;
    }

    public void showType(){
        System.out.println("Type of T is " + ob.getClass().getSimpleName());
    }
}
