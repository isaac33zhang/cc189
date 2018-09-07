package com.cc189;

class MinimalTree {
    TreeNode minimalTree(int[] arr) {
        return createMinimalTree(arr, 0, arr.length-1);
    }

    TreeNode createMinimalTree(int[] arr, int start, int end) {
        if (end < start) { return null; }
        int mid = (start + end) / 2;
        TreeNode midNode = new TreeNode(arr[mid]);
        TreeNode left = createMinimalTree(arr, start, mid - 1);
        TreeNode right = createMinimalTree(arr, mid + 1, end);
        midNode.left = left;
        midNode.right = right;
        return midNode;
    }
}
