package com.sayem.loops.while_loop.part1;


public class Demo3 {

    public static void main(String [] args){

        int n = 0;
        int i = 1;

        while (i < 4){

            int j = 1;
            while (j <=i){
                n +=1;
                j++;
            }

            i = i +1;

        }
    }
}
