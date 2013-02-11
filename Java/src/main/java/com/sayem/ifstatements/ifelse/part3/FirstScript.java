package com.sayem.ifstatements.ifelse.part3;

import java.util.Scanner;

public class FirstScript {

    public static void main(String [] args){

        Scanner input = new Scanner(System.in);

        int number1; // first number to compare
        int number2; // second number to compare

        System.out.print(" Enter first integers: "); // prompt
        number1 = input.nextInt();

        System.out.print(" Enter second interer: "); // promot
        number2 = input.nextInt();

        if( number1 == number2)
            System.out.printf(" %d == %d\n", number1, number2);


        if (number1 != number2)
            System.out.printf("%d != %d\n", number1, number2);


        if (number1 < number2)
            System.out.printf("%d < %d\n", number1, number2);


        if(number1 > number2)
            System.out.printf("%d > %d\n", number1, number2);

        if (number1 <= number2)
            System.out.printf("%d <= %d\n", number1, number2);

        if (number1 >= number2)
            System.out.printf("%d >= %d\n", number1, number2);
    }
}
