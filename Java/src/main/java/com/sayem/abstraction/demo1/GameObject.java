package com.sayem.abstraction.demo1;

public abstract class GameObject {

    // This method must be implemented by any class that extends game object
    public abstract void draw();

    // This method doesnt need to be implemented by sub-classes.
    public void nonAbstractMethod(){
        System.out.println("This is a non-Abstract Method");
    }


}
