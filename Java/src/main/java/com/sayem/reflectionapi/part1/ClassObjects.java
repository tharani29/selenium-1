package com.sayem.reflectionapi.part1;

import java.awt.*;

public class ClassObjects {

    public static void main(String [] args){
        Color color = new Color(1030);
        myObjectMethod(color);
        Class<?> c1 = Color.class;
        System.out.println(c1.getName());
        Class<?> c2 = String.class;
        System.out.println(c2.getName());
        Class<?> c3 = int.class;
        System.out.println(c3.getName());
        Class<?> c4 = Integer.TYPE;
        System.out.println(c4.getName());
        Class<?> c5 = void.class;
        System.out.println(c5.getName());
        try {
            createClass("java.lang.String");

        }catch (Exception e){
            System.out.println(e);
        }

    }



    static void myObjectMethod(Object obj){
        Class<?> c = obj.getClass();
        System.out.println(c.getName());
    }

    static <T> void myMethod(T obj){
        Class<?> c = obj.getClass();
        System.out.println(c.getName());
    }
    static void createClass(String name) throws ClassNotFoundException{
        Class<?> c = Class.forName(name);
        System.out.println(c.getName());
    }
}
