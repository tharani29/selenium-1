package com.sayem.loops.nested_for_loop;

public class NestedLoop {

    public static void main(String [] args){

        for (int r = 0; r < 10; r++ ){
            for (int c = 0; c < r; c++){
                System.out.print("*");
            }
            System.out.println("*");
        }
    }
}
