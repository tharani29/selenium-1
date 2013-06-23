package com.sayem.exercise_strategy;

public class MuteDuck implements QuakBehavior{
    @Override
    public void quak() {
        System.out.println("<<silence>>");
    }
}
