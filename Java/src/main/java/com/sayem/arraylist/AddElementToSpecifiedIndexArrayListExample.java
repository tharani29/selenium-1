/*
    Add an element to specified index of Java ArrayList Example
    This Java Example shows how to add an element at specified index of java
    ArrayList object using add method.
*/

package com.sayem.arraylist;

import java.util.ArrayList;

public class AddElementToSpecifiedIndexArrayListExample {

    public static void main(String [] args){

        // Create an ArrayList object
        ArrayList arraylist = new ArrayList();


        // Add elements to ArrayList
        arraylist.add("1");
        arraylist.add("2");
        arraylist.add("3");

    /*
      To add an element at the specified index of ArrayList use
      void add(int index, Object obj) method.
      This method inserts the specified element at the specified index in the
      ArrayList.
    */

        arraylist.add(1, "INSERTED ELEMENTS");

    /*
      Please note that add method DOES NOT overwrites the element previously
      at the specified index in the list. It shifts the elements to right side
      and increasing the list size by 1.
    */

        System.out.println("ArrayList contains...");

        // display elements of ArrayList

        for (int index = 0; index <= arraylist.size(); index++){
            System.out.println(index);
        }
    }
}
