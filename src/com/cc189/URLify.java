package com.cc189;

import java.util.Arrays;

class URLify {
    void urlify(char[] s, int trueLength){
        int spaceNumber = 0, start = 0;
        for (int i = 0; i < s.length; i++) {
            if (s[i] != ' ') {
                start = i;
                break;
            }
        }
        for (int i = start; i < trueLength; i++) {
            if (s[i] == ' ') spaceNumber++;
        }
        int index = trueLength + spaceNumber * 2;
        s[index] = '\0';
        index--;
        for (int i = trueLength - 1; i >= start; i--){
            if (s[i] == ' ') {
                s[index] = '0';
                s[index - 1] = '2';
                s[index - 2] = '%';
                index = index - 3;
            } else {
                s[index] = s[i];
                index--;
            }
        }
        s = Arrays.copyOfRange(s, start, index);
    }
}
