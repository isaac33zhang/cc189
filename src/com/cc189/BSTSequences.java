package com.cc189;

import java.util.ArrayList;
import java.util.LinkedList;

class BSTSequences {
    ArrayList<LinkedList<Integer>> allSequences(TreeNode root) {
        ArrayList<LinkedList<Integer>> results = new ArrayList<LinkedList<Integer>>();
        if (root == null) {
            results.add(new LinkedList<Integer>());
            return results;
        }
        LinkedList<Integer> prefix = new LinkedList<Integer>();
        prefix.add(root.getValue());
        ArrayList<LinkedList<Integer>> left = allSequences(root.left);
        ArrayList<LinkedList<Integer>> right = allSequences(root.right);
        for (LinkedList<Integer> singleLeft : left) {
            for (LinkedList<Integer> singleRight : right) {
                ArrayList<LinkedList<Integer>> weaved = new ArrayList<LinkedList<Integer>>();
                weaveLists(singleLeft, singleRight, weaved, prefix);
                results.addAll(weaved);
            }
        }
        return results;
    }

    void weaveLists(LinkedList<Integer> left, LinkedList<Integer> right,
                    ArrayList<LinkedList<Integer>> results, LinkedList<Integer> prefix) {
        if (left.size() == 0 || right.size() == 0) {
            LinkedList<Integer> result = (LinkedList<Integer>) prefix.clone();
            result.addAll(left);
            result.addAll(right);
            results.add(result);
            return;
        }

        int headLeft = left.removeFirst();
        prefix.addLast(headLeft);
        weaveLists(left, right, results, prefix);
        prefix.removeLast();
        left.addFirst(headLeft);

        int headRight = right.removeFirst();
        prefix.addLast(headRight);
        weaveLists(left, right, results, prefix);
        prefix.removeLast();
        right.addFirst(headRight);
    }
}
