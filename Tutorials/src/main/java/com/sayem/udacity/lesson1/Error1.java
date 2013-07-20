package com.sayem.udacity.lesson1;

public class Error1 {
    public static void main(String[] args) {
        int n = 10;
        while (n > 1){
            System.out.println(n);
            if (n == n){
                n = n / 2;
            }else{
                n = 3 * n + 1;
            }
        }
    }
}
