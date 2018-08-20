package com.cc189;

class StringCompression {
    String stringCompression(String s) {
        int compressedLength = countCompressed(s);
        if (compressedLength >= s.length()) return s;

        StringBuilder compressedString = new StringBuilder(compressedLength);
        int lettersInARow = 0;
        for (int i = 0; i < s.length(); i++) {
            lettersInARow++;
            if(i + 1 >= s.length() || s.charAt(i) != s.charAt(i + 1)) {
                compressedString.append(s.charAt(i));
                compressedString.append(lettersInARow);
                lettersInARow = 0;
            }
        }
        return compressedString.toString();
    }

    int countCompressed(String s) {
        int leng = 0;
        int lettersInARow = 0;
        for (int i = 0; i < s.length(); i++) {
            lettersInARow++;
            if (i + 1 >= s.length() || s.charAt(i) != s.charAt(i + 1)) {
                leng += 2;
                lettersInARow = 0;
            }
        }
        return leng;
    }
}
