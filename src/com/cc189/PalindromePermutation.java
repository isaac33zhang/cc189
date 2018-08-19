package com.cc189;

import java.lang.Character;

class PalindromePermutation {
    boolean isPalindromePermutation(String s) {
        int countOdd = 0;
        int[] numbers = new int[Character.getNumericValue('z') - Character.getNumericValue('a') + 1];
        for (char c : s.toCharArray()) {
            int x = getCharNumericValue(c);
            if (x >= 0) {
                numbers[x]++;
                if (numbers[x] % 2 == 1) {
                    countOdd++;
                } else {
                    countOdd--;
                }
            }
        }
        return countOdd <= 1;
    }

    boolean isPalindromePermutationByBits(String s) {
        int bitVector = createBitVector(s);
        return bitVector == 0 || onlyOneBit(bitVector);
    }

    int createBitVector(String s) {
        int bitVector = 0;
        for (char c : s.toCharArray()) {
            int x = getCharNumericValue(c);
            bitVector = toggle(bitVector, x);
        }
        return bitVector;
    }

    int toggle(int bitVector, int index) {
        if (index < 0) return bitVector;
        int mask = 1 << index;
        if ((bitVector & mask) == 0) {
            bitVector |= mask;
        } else {
            bitVector &= ~mask;
        }
        return bitVector;
    }

    boolean onlyOneBit(int bitVector) {
        return (bitVector & (bitVector - 1)) == 0;
    }

    int getCharNumericValue(char c) {
        int a = Character.getNumericValue('a');
        int z = Character.getNumericValue('z');
        int cValue = Character.getNumericValue(c);
        if (a <= cValue && cValue <= z) {
            return cValue - a;
        }
        return -1;
    }
}
