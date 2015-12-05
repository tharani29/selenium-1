package org.sayem.algorithm;

public interface Attemptable<T> {
    T attempt() throws Exception;
}