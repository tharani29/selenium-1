package com.sayem.generics;

public class ABC<T> {

    // Declares an object of type T
    T obj;

    // The constructor
    ABC (T obj){
        this.obj = obj;
    }

    // Return obj
    T getObj(){
        return obj;
    }



}
