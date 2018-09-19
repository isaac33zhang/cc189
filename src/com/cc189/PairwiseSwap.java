package com.cc189;

class PairwiseSwap {
    int swap(int num) {
        return (((num & 0xaaaaaaaa) >>> 1) | ((num & 0x55555555) << 1));
    }
}
