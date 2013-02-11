package com.sayem.overriding.part1;

public class Subclass extends Base{


    // We are calling the sayHello method defined in Base class
    public Subclass(){
        sayHello();
    }


    public static void main(String [] args){

        Subclass s = new Subclass();

        // Alternatively, we can call the method in the base class using the method on the instance we created
        // and skip creating the constructor.
        //s.sayHello();
    }

    @Override
    public void sayHello() {
        //super.sayHello();    //To change body of overridden methods use File | Settings | File Templates.
        System.out.println("Hi");
    }

}
