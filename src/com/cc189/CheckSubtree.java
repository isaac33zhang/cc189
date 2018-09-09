package com.cc189;

class CheckSubtree {
    boolean checkSubree(TreeNode T1, TreeNode T2) {
        if (T2 == null) return true;
        return subtree(T1, T2);
    }

    boolean subtree(TreeNode T1, TreeNode T2) {
        if (T1 == null) {
            return false;
        } else if (T1.getValue() == T2.getValue() && matchTree(T1, T2)) {
            return true;
        }
        return subtree(T1.left, T2) || subtree(T1.right, T2);
    }

    boolean matchTree(TreeNode T1, TreeNode T2) {
        if (T1 == null && T2 == null) {
            return true;
        } else if (T1 == null) {
            return false;
        } else if (T1.getValue() != T2.getValue()) {
            return false;
        } else {
            return matchTree(T1.left, T2.left) && matchTree(T1.right, T2.right);
        }
    }
}
