package com.sayem.ifstatements.ifstatement.part1;

public class SecondScript {

    public static void main(String [] args){

        int marks = 76;
        String grade = null;

        if (marks >= 40){
            grade = "Pass";
        }

        if (marks < 40){
            grade = "fail";
        }

        System.out.println("Grade = " + grade);
    }
}
