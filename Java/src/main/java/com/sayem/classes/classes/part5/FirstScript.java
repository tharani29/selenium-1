package com.sayem.classes.classes.part5;


public class FirstScript {

    String firstName;

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public boolean equal(Object o){
        if(o instanceof FirstScript){
            FirstScript fs = (FirstScript) o;
            if (firstName == fs.firstName){
                return true;
            }

        }

        return false;
    }
}
