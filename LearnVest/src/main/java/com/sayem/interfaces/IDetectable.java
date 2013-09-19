package com.sayem.interfaces;

/**
 * This interface allows a user to configure UI controls with functionality to
 * determine whether or not the control is visible.
 * @author sayem
 *
 */
public interface IDetectable {

    /**
     * This method determines whether or not the control is visible.
     * @return true or false
     */
    boolean exists();

}