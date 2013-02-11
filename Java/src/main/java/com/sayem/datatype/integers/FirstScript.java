package com.sayem.datatype.integers;

import java.util.Scanner;

public class FirstScript {

    public static void main(String [] args){
        Scanner input = new Scanner(System.in);

        int number1;
        int number2;
        int sum;


        System.out.print(" Enter first integers: "); // prompt
        number1 = input.nextInt(); // read first number from user

        System.out.print(" Enter second integers: "); // prompt
        number2 = input.nextInt(); // read second number from user

        sum = number1 + number2;

        System.out.printf("Sum is %d\n", sum);

    }
}
