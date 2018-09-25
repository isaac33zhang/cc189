package com.cc189;

import java.util.ArrayList;

class PermutationWithNoDup {
    ArrayList<String> getPermutations(String str) {
        if (str == null) return null;
        ArrayList<String> permutations = new ArrayList<String>();
        if (str.length() == 0) {
            permutations.add("");
            return permutations;
        }
        char first = str.charAt(0);
        String remain = str.substring(1);
        ArrayList<String> otherPermutations = getPermutations(remain);
        for (String perm : otherPermutations) {
            for (int i = 0; i <= perm.length(); i++) {
                String s = insertChar(perm, first, i);
                permutations.add(s);
            }
        }
        return permutations;
    }

    private String insertChar(String s, char c, int index) {
        String start = s.substring(0, index);
        String end = s.substring(index);
        return start + c + end;
    }
}
