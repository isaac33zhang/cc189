package com.cc189;

import java.util.ArrayList;
import java.util.HashMap;

class PermutationsWithDups {
    ArrayList<String> getPermutations(String s) {
        ArrayList<String> results = new ArrayList<String>();
        HashMap<Character, Integer> map = buildHashMap(s);
        getPerms(map, "", s.length(), results);
        return results;
    }

    private HashMap<Character, Integer> buildHashMap(String s) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for (char c : s.toCharArray()) {
            if (!map.containsKey(c)) {
                map.put(c, 1);
                continue;
            }
            map.put(c, map.get(c) + 1);
        }
        return map;
    }

    private void getPerms(HashMap<Character, Integer> map, String prefix, int rest, ArrayList<String> results) {
        if (rest == 0) {
            results.add(prefix);
            return;
        }
        for (Character c : map.keySet()) {
            int count = map.get(c);
            if (count > 0) {
                map.put(c, count - 1);
                getPerms(map, prefix + c, rest - 1, results);
                map.put(c, count);
            }
        }
    }
}
