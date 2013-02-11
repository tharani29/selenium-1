package com.sayem.enumeration;

/**
 * Hello world!
 *
 */
public class ColorApp{

    public static void main( String[] args ){

        Color myColor = Color.BLUE;
        System.out.printf("MyColor: %s%n", myColor);
        System.out.printf("myColor rgbValue: %s%n", myColor.rgbValue());

        for(Color c : Color.values()){
            System.out.printf(" %s ", c);
        }
        System.out.println();

    }
}
