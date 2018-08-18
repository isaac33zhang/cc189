package com.cc189;

import com.cc189.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // test IsUnique
        String[] inputs = {"a", "abc", "abb"};
        boolean[] results = {true, true, false};
        IsUnique isUnique = new IsUnique();
        for (int i = 0; i < inputs.length; i++) {
            boolean result = isUnique.isUniqueCars(inputs[i]);
            assert result == results[i];
        }
    }
}
