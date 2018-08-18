package com.cc189;

import com.cc189.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // test IsUnique
        testIsUnique();
        //test CheckPermutation
        testCheckPermutation();
    }

    private static void testIsUnique() {
        String[] inputs = {"a", "abc", "abb"};
        boolean[] results = {true, true, false};
        IsUnique isUnique = new IsUnique();
        for (int i = 0; i < inputs.length; i++) {
            boolean result = isUnique.isUniqueCars(inputs[i]);
            assert result == results[i];
        }
    }

    private static void testCheckPermutation() {
        String[] inputsOne = {"a", "abc", "abb", "acc"};
        String[] inputsTwo = {"a", "cba", "bab", "abc"};
        boolean[] results = {true, true, true, false};
        CheckPermutation checkPermutation = new CheckPermutation();
        for(int i = 0; i < inputsOne.length; i++){
            boolean result = checkPermutation.isPermutation(inputsOne[i], inputsTwo[i]);
            assert result == results[i];
        }
    }
}
