package com.sayem.headfirst.exercise_strategy;

public abstract class Duck {
    QuakBehavior quakBehavior;
    FlyBehavior flyBehavior;
    // more

    protected Duck() {
    }

    public abstract void display();

    public void performFly(){
        flyBehavior.fly();
    }

    public void performQuak(){
        quakBehavior.quak();
    }

    public void swim(){
        System.out.println("All ducks float, even decoys");
    }
}
