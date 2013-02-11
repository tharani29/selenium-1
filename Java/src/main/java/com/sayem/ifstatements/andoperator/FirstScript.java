package com.sayem.ifstatements.andoperator;


public class FirstScript {

    public static void main(String [] args){
        int marks = 71;
        char grade;

        if(marks >= 90 && marks > 80){
            System.out.println("Class A");
        }else if (marks < 80 && marks > 70){
            System.out.println("Class B");
        }else if (marks < 70 && marks > 60){
            System.out.println("Class C");
        }
    }
}
