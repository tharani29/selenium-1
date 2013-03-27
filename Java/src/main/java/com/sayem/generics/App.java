package com.sayem.generics;

// http://www.clear.rice.edu/comp310/JavaResources/generics/

// http://www.java2s.com/Tutorial/Java/0200__Generics/Catalog0200__Generics.htm
// http://code.stephenmorley.org/articles/java-generics-type-erasure/
// http://www.programmingforfuture.com/2009/02/re-java-generic-examples-source-code.html
// http://java2novice.com/java-generics/simple-class/
// http://learnertobeginner.blogspot.com/2011/06/basics-of-java-generics.html
// http://mindprod.com/jgloss/generics.html

//http://ted-gao.blogspot.com/search/label/Java%20Generics

public class App<T> {

    // Declares an object of type T
    T obj;

    // The constructor
    App(T obj){
        this.obj = obj;
    }

    // Return obj
    T getObj(){
        return obj;
    }
}
