package com.cc189;

class FirstCommonAncestor {
    TreeNode commonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (!covers(root, p) || !covers(root, q)) {
            return null;
        }
        return findAncestor(root, p, q);
    }

    private TreeNode findAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || p == root || q == root) return root;
        boolean pInLeft = covers(root.left, p);
        boolean qInLeft = covers(root.left, q);
        if (qInLeft != pInLeft) return root;
        TreeNode child = pInLeft ? root.left : root.right;
        return findAncestor(child, p, q);
    }

    private boolean covers(TreeNode root, TreeNode p) {
        if (root == null) return false;
        if (root == p) return true;
        return covers(root.left, p) || covers(root.right, p);
    }
}
