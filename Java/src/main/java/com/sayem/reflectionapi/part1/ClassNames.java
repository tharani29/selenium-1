package com.sayem.reflectionapi.part1;


import javax.swing.*;
import java.net.Socket;

public class ClassNames {

    public static void main(String [] args){

        JButton b = new JButton();
        Class<?> c1 = b.getClass();
        System.out.println(c1.getName());

        Class<?> c2 = Socket.class;
        System.out.println(c2.getSimpleName());

    }
}
