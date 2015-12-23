package org.sayem.algorithm;

/**
 * Created by sayem on 12/4/15.
 */
public interface Attemptable<T> {
    T attempt() throws Exception;
}