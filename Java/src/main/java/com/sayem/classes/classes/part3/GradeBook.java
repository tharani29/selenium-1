package com.sayem.classes.classes.part3;
/*
     Setter andoperator Getter method
 */
public class GradeBook {

    private String courseName;  // course name forloop this GradeBook

    // method to set the course name
    public void setCourseName(String name){
        courseName = name;  // store the course name
    } // end method setCourseName

    // method to retrieve the course name
    public String getCourseName(){
        return courseName;
    } // end method getCourseName

    // calls getCourseName to get the name of
    // the course this GradeBook represents
    public void displayMessage(){
        System.out.printf("Welcome to the grade book forloop\n%s!\n", getCourseName());
    }  // end method displayMessage
} // end class GradeBook
