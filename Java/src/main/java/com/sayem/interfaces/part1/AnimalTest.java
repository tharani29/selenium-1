package com.sayem.interfaces.part1;

public class AnimalTest {

    public static void main(String [] args){

        Animal pet = new Animal();
        pet.makeNoise();

        Noisy thing;
        thing = pet;
        doStuff(pet);


    }


    public static void doStuff(Noisy n){
        n.makeNoise();
    }
}
