package com.cc189;

import java.util.HashMap;

class PathsWithSum {
    int countPaths(TreeNode root, int target) {
        return countPaths(root, target, 0, new HashMap<Integer, Integer>());
    }

    int countPaths(TreeNode root, int target, int currentSum, HashMap<Integer, Integer> pathCount) {
        if (root == null) return 0;
        currentSum += root.getValue();
        int sum = currentSum - target;
        int pathNumber = pathCount.getOrDefault(sum, 0);
        if (currentSum == target) {
            pathNumber++;
        }
        updateHashTable(pathCount, currentSum, 1);
        pathNumber += countPaths(root.left, target, currentSum, pathCount);
        pathNumber += countPaths(root.right, target, currentSum, pathCount);
        updateHashTable(pathCount, currentSum, -1);
        return pathNumber;
    }

    void updateHashTable(HashMap<Integer, Integer> hashTable, int key, int amount) {
        int newValue = hashTable.getOrDefault(key, 0) + amount;
        if (newValue == 0) {
            hashTable.remove(key);
        } else {
            hashTable.put(key, newValue);
        }
    }
}
