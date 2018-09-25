package com.cc189;

class RecursiveMultiply {
    int multiply(int a, int b) {
        int smaller = a > b ? b : a;
        int larger = a > b ? a : b;
        return multiplyHelper(smaller, larger);
    }

    int multiplyHelper(int small, int large) {
        if (small == 0) return 0;
        if (small == 1) return large;
        int newSmall = small >> 2;
        int half = multiplyHelper(newSmall, large);
        if (small % 2 == 1) {
            return half + half + large;
        } else {
            return half + half;
        }
    }
}
