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

    TreeNode commonAncestorOptimized(TreeNode root, TreeNode p, TreeNode q) {
        Result r = commonAncestorHelper(root, p, q);
        if (r.isAncestor) { return r.node; }
        return null;
    }

    Result commonAncestorHelper(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) { return new Result(null, false); }
        if (root == p && root == q) { return new Result(root, true); }
        Result left = commonAncestorHelper(root.left, p, q);
        if (left.isAncestor) { return left; }
        Result right = commonAncestorHelper(root.right, p, q);
        if (right.isAncestor) { return right; }
        if (root == p || root == q) {
            boolean isAnc = left.node != null || right.node != null;
            return new Result(root, isAnc);
        } else if (left.node != null && right.node != null) {
            return new Result(root, true);
        } else {
            return new Result(left.node == null ? right.node : left.node, false);
        }
    }
}

class Result{
    TreeNode node;
    boolean isAncestor;
    public Result(TreeNode n, boolean isAnc) {
        node = n;
        isAncestor = isAnc;
    }
}

