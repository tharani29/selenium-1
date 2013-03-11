package com.sayem.calendar;

import java.util.Calendar;

public class AddDaysToCurrentDate {

    public static void main(String [] args){

        Calendar now = Calendar.getInstance();

        System.out.println("Current date : "+ (now.get(Calendar.MONTH) + 1)
                        + "-"
                        + now.get(Calendar.DATE)
                        + "-"
                        + now.get(Calendar.YEAR));

        //add days to current date using Calendar.add method

        now.add(Calendar.DATE, 1);

        System.out.println("date after one day: " + (now.get(Calendar.MONTH)+1)
                        + "-"
                        + now.get(Calendar.DATE)
                        + "-"
                        + now.get(Calendar.YEAR));

        //substract days from current date using Calendar.add method
        now = Calendar.getInstance();
        now.add(Calendar.DATE, -10);

        System.out.println("date before 10 days : " + (now.get(Calendar.MONTH) + 1)
                + "-"
                + now.get(Calendar.DATE)
                + "-"
                + now.get(Calendar.YEAR));

    }
}


