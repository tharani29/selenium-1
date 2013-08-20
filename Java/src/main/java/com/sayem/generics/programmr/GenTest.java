package com.sayem.generics.programmr;

public class GenTest {
    public static void main(String[] args) {

        Gen<Integer> iOb = new Gen<Integer>(88);
        Gen<String> strOb = new Gen<String>("Generics");


        iOb.showType();
        int v = iOb.getOb();
        System.out.println("value: " + v);

        strOb.showType();
        String s = strOb.getOb();
        System.out.println("value: " + s);
    }
}
