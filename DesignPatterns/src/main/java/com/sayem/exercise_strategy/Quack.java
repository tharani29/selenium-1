package com.sayem.exercise_strategy;

public class Quack implements QuakBehavior{
    @Override
    public void quak() {
        System.out.println("Quak");
    }
}
