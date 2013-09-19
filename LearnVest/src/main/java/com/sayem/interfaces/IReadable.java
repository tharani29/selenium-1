package com.sayem.interfaces;


/**
 * This interface allows a user to configure UI controls with functionality to read the text of the control.
 * @author sayem
 *
 */
public interface IReadable {

    /**
     * This method enables the text value of the control to be read.
     * @return an object representing the text of the control.  Typically this would be a String.
     */
    Object read();

}