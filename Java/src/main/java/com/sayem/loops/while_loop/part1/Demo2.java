package com.sayem.loops.while_loop.part1;

public class Demo2 {

    public static void main(String [] args){

        int x = 0;
        int y = 20;

        while (x <= y){  // Loop  Start here
            System.out.println("The value of x: " + x);
            if(x == 3) // If Statement start here
                continue;
             // End of If Statement
            x++;
        }  // End of While loop
    }
}
