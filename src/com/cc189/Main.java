package com.cc189;

import com.cc189.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // test IsUnique
        testIsUnique();
        //test CheckPermutation
        testCheckPermutation();
        //test PalindromePermutation
        testCheckPalindromePermutation();
        //test OneAway
        testOneAway();
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
        for (int i = 0; i < inputsOne.length; i++) {
            boolean result = checkPermutation.isPermutation(inputsOne[i], inputsTwo[i]);
            assert result == results[i];
        }
    }

    private static void testCheckPalindromePermutation() {
        String[] inputs = {"a", "abcba", "accbb", "aaabbb"};
        boolean[] results = {true, true, true, false};
        PalindromePermutation palindromePermutation = new PalindromePermutation();
        for (int i = 0; i < inputs.length; i++) {
            boolean result = palindromePermutation.isPalindromePermutation(inputs[i]);
            assert result == results[i];
            boolean newResult = palindromePermutation.isPalindromePermutationByBits(inputs[i]);
            assert  newResult == results[i];
        }
    }

    private static void testOneAway() {
        String[] inputs1 = {"a", "abc", "abcd", "abcde", "abcdef"};
        String[] inputs2 = {"b", "abcd", "abc", "abcdf", "abedcf"};
        boolean[] results = {true, true, true, true, false};
        OneAway oneAway = new OneAway();
        for (int i = 0; i < inputs1.length; i++) {
            boolean result = oneAway.oneEditAway(inputs1[i], inputs1[i]);
            assert result == results[i];
        }
    }
}
