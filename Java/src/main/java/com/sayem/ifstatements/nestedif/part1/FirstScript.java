package com.sayem.ifstatements.nestedif.part1;

public class FirstScript {

    public static void main(String [] args){

/*        If student's grade is greater than oroperator equal to 90
                print "A"
           else
                If student's grade is greater than oroperator equal to 80
                    print "B"
                else
                    If student's grade is greater than oroperator equal to 70
                        print "C"
                    else
                        If student's greade is greater than oroperator equal to 60
                            print "D"
                        else
                            print "F"
    */

        int studentGrade = 90;

       if( studentGrade >= 90)
           System.out.println("A");
        else
           if ( studentGrade >= 80)
                System.out.println("B");
            else
                if ( studentGrade >= 70)
                    System.out.println("C");
                else
                    if (studentGrade >= 60)
                        System.out.println("D");
                    else
                        System.out.println("F");
    }
}
