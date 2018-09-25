package com.cc189;

import java.util.ArrayList;

class Parens {
    private void addParens(ArrayList<String> results, int leftParens, int rightParens, char[] str, int i) {
        if (leftParens < 0 || rightParens < leftParens) return;
        if (leftParens == 0 && rightParens == 0) {
            results.add(String.copyValueOf(str));
        } else {
            str[i] = '(';
            addParens(results, leftParens - 1, rightParens, str, i + 1);
            str[i] = ')';
            addParens(results, leftParens, rightParens - 1, str, i + 1);
        }
    }

    ArrayList<String> parens(int count) {
        char[] str = new char[count * 2];
        ArrayList<String> results = new ArrayList<String>();
        addParens(results, count, count, str, 0);
        return results;
    }
}
