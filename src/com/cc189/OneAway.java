package com.cc189;

class OneAway {
    boolean oneEditAway(String first, String second) {
        if(Math.abs(first.length() - second.length()) > 1) return false;
        String shorter = first.length() < second.length() ? first : second;
        String longer = first.length() < second.length() ? second : first;
        int index1 = 0;
        int index2 = 0;
        boolean diffFound = false;
        while (index1 < shorter.length() && index2 < longer.length()) {
            if (shorter.charAt(index1) != longer.charAt(index2)) {
                if (diffFound) return false;
                diffFound = true;
                if (shorter.length() == longer.length()) {
                    index1++;
                }
            } else {
                index1++;
            }
            index2++;
        }
        return true;
    }
}
