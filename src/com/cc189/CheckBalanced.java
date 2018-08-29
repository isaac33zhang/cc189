package com.cc189;

class CheckBalanced {
    boolean checkBalanced(TreeNode root) {
        if (root == null) return true;
        int result = checkHeight(root);
        if (result == Integer.MIN_VALUE) return false;
        return true;
    }

    int checkHeight(TreeNode root) {
        if (root == null) return -1;

        int leftHeight = checkHeight(root.left);
        if (leftHeight == Integer.MIN_VALUE) return Integer.MIN_VALUE;
        int rightHeight = checkHeight(root.right);
        if (rightHeight == Integer.MIN_VALUE) return Integer.MIN_VALUE;

        int rootHeight = Math.max(leftHeight, rightHeight) + 1;
        int diff = Math.abs(leftHeight - rightHeight);
        if (diff > 1) {
            return Integer.MIN_VALUE;
        } else {
            return rootHeight;
        }
    }
}
