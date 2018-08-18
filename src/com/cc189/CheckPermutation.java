package com.cc189;

class CheckPermutation {
    boolean isPermutation(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        int letters[] = new int[128];
        for(int i = 0; i < s1.length(); i++) {
            letters[i]++;
        }
        for(int i = 0; i < s2.length(); i++) {
            letters[i]--;
            if(letters[i] < 0) return false;
        }
        return true;
    }
}
