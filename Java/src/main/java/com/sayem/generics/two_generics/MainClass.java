package com.sayem.generics.two_generics;

public class MainClass {

    public static void main(String[] args) {
        TwoGen<Integer, String> tgObj = new TwoGen<Integer, String>(88, "Generics");
        tgObj.showType();

        int v = tgObj.getOb1();
        System.out.println("value " + v);

        String str = tgObj.getOb2();
        System.out.println("value " + str);
    }
}
