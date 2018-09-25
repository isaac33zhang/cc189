package com.cc189;

import java.util.ArrayList;

class PowerSet {
    ArrayList<ArrayList<Integer>> getSubsets(ArrayList<Integer> originalSet, int index) {
        ArrayList<ArrayList<Integer>> results = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i <= index; i++) {
            if (i == 0) {
                results.add(new ArrayList<Integer>());
                continue;
            }
            Integer item = originalSet.get(i - 1);
            ArrayList<ArrayList<Integer>> moreSubsets = new ArrayList<ArrayList<Integer>>();
            for (ArrayList<Integer> subset : results) {
                ArrayList<Integer> newSubset = new ArrayList<Integer>(subset);
                newSubset.add(item);
                moreSubsets.add(newSubset);
            }
            results.addAll(moreSubsets);
        }
        return results;
    }
}
