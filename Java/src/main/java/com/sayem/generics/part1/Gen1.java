package com.sayem.generics.part1;

public class Gen1 {
    public static void main(String[] args) {
        A<Integer> al = new A<>();
        al.setObj(123);

        int i = al.getObj();
        System.out.println(i);
    }
}
