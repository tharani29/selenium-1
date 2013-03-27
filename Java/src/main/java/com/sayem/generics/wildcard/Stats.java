package com.sayem.generics.wildcard;
// Use a wildcard
public class Stats<T extends Number> {
    T[] nums; // array of Number or subclass

    // Pass the constructor a reference to
    // an array of type Number or subclass.

    public Stats(T[] nums) {
        this.nums = nums;
    }

    // Return type double in all cases.
    public double average(){

        double sum = 0.0;

        for (int i=0; i <nums.length; i++){
            sum += nums[i].doubleValue();
        }
        return sum / nums.length;

    }

    // Determine if two averages are the same.
    // Notice the use of the wildcard.
    boolean sameAvg(Stats<?> ob){
        if (average() == ob.average()){
            return true;
        }
        return false;
    }
}
