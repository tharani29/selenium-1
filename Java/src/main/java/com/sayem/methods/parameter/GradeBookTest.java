package com.sayem.methods.parameter;

import java.util.Scanner;

public class GradeBookTest {

    public static void main(String [] args){

        Scanner input = new Scanner(System.in);

        String nameOfCours = input.nextLine();

        GradeBook myGradeBook = new GradeBook();
        myGradeBook.displayMessage(nameOfCours);

    }
}
