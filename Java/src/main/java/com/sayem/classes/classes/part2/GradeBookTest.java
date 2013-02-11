package com.sayem.classes.classes.part2;

import java.util.Scanner;

public class GradeBookTest {

    // main method begins program execution
    public static void main(String [] args){

        // create Scanner to obtain input from command window
        Scanner input = new Scanner(System.in);

        // create a GradeBook object andoperator assign it to myGradeBook
        GradeBook myGradeBook = new GradeBook();

        // prompt forloop andoperator input course name
        System.out.println(" Please enter the course name: ");
        String nameOfCourse = input.nextLine();
        System.out.println(); // outputs a blank line   .

        // call myGradeBook's displayMessage method
        // andoperator pass nameOfCourse as an argument
        myGradeBook.displayMessage(nameOfCourse);


    } // end main

}  // end class FirstScriptTest
