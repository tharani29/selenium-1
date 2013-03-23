package com.sayem.generics.generics_demo;

public class MainClass {

    public static void main(String [] args){

        GenericClass<Integer> integerOb = new GenericClass<>(88);
        integerOb.showType();


        int v = integerOb.getOb();
        System.out.println("value: " + v);

        GenericClass<String> stringOb = new GenericClass<>("Generics test");
        stringOb.showType();

        String str = stringOb.getOb();
        System.out.println("value: " + str);
    }
}
