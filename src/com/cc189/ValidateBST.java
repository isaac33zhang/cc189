package com.cc189;

class ValidateBST {
    boolean validateBST(TreeNode root) {
        if (root == null) return true;
        return validateBST(root, null, null);
    }

    boolean validateBST(TreeNode root, Integer min, Integer max) {
        if (root == null) return true;
        if ((min != null && root.getValue() <= min) || (max != null && root.getValue() > max)) return false;
        return validateBST(root.left, min, root.getValue()) && validateBST(root.right, root.getValue(), max);
    }
}
