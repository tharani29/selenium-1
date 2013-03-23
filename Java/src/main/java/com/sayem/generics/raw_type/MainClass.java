package com.sayem.generics.raw_type;

public class MainClass {

    public static void main(String[] args) {
        Gen<Integer> iOb = new Gen<Integer>(88);
        Gen<String> sOb = new Gen<String>("Generics Test");

        Gen raw = new Gen(new Double(98.6));

        double d = (Double) raw.getOb();
        System.out.println("value: " + d);

        sOb = raw;
        String str = sOb.getOb();

        raw = iOb;
        d = (Double) raw.getOb();




    }
}
