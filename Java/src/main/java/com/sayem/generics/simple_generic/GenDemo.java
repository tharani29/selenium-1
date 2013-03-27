package com.sayem.generics.simple_generic;

public class GenDemo {

    public static void main(String[] args) {
        // Create a Gen reference for Intergers.
        Gen<Integer> iOb = new Gen<Integer>(88);

        // Show the type of data used by iOb.
        iOb.showType();

        // Create a Gen reference for String
        Gen<String> strOb = new Gen<String>("Generic Test");

        // Show the type of data used by strOb.
        strOb.showType();

        // Get the value of strOb, Again, notice
        // that no cast is needed.
        String str = strOb.getOb();
        System.out.println("Value: " + str);



    }
}
