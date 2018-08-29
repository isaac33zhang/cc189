package com.cc189;

class MinimalBST {
    TreeNode createMinimalBST(int[] inputs) {
        return createMinimalBST(inputs, 0, inputs.length - 1);
    }

    private TreeNode createMinimalBST(int[] inputs, int start, int end) {
        if (end < start) return null;
        int mid = ( start + end ) / 2;
        TreeNode root = new TreeNode(inputs[mid]);
        root.left = createMinimalBST(inputs, start, mid - 1);
        root.right = createMinimalBST(inputs, mid + 1, end);
        return root;
    }
}

class TreeNode {
    private int value;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int data) {
        value = data;
    }
}
