package com.sayem.multithreading.demo4;

import java.util.Scanner;

public class App {

    public static void main(String [] args){

        Processor ps1 = new Processor();
        ps1.start();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Press return to STOP ");
        scanner.nextLine();
        ps1.shutDown();

    }
}
