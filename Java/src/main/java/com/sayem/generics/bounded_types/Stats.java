package com.sayem.generics.bounded_types;

// Stats attempts (unsuccessfully) to
// create a generic class that can compute
// the average of an array of numbers of
// any given type

public class Stats<T extends Number>  {
    T[] nums; // num is an array of type T

    // Pass the constructor a reference to
    // an array of type T

    public Stats(T[] nums) {
        this.nums = nums;
    }

    // Return type double in all cases.
    double average(){
        double sum = 0.0;
        for (int i=0; i<nums.length; i++){
            sum += nums[i].doubleValue(); // Error!!!
        }

        return sum / nums.length;

    }
}
