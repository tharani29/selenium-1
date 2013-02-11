package com.sayem.ifstatements.ifstatement.part3;

import java.util.Random;

public class FirstScript {

    public static void main(String [] args){

        Random rand = new Random();
        int a = rand.nextInt();
        int b = rand.nextInt();
        int c = rand.nextInt();

        if((a +b) > c){
            System.out.println( "Sum is greater" );
        }else if ((a+b) == c){
            System.out.println( "The same" );
        }else{
            System.out.println( "Sum is NOT greater" );
        }


    }
}
