package com.sayem.interfaces;

/**
 * This interface provides functionality for selecting and deselecting a control.
 * @author sayem
 *
 */
public interface ISelectable {

    /**
     * This method enables the control to be set as selected.
     */
    void select();

    /**
     * This method enables the control to be set as deselected.
     */
    void deSelect();

}