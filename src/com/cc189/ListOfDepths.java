package com.cc189;

import java.util.ArrayList;

class ListOfDepths {
    ArrayList<MyLinkedList> listOfDepths(TreeNode root) {
        ArrayList<MyLinkedList> results = new ArrayList<MyLinkedList>();
        MyLinkedList current = new MyLinkedList();
        if (root != null) {
            current.addToEnd(root);
        }
        while (current.getLength() != 0) {
            results.add(current);
            MyLinkedList parents = current;
            current = new MyLinkedList();
            MyNode currentHead = parents.getHead();
            while (currentHead != null) {
                TreeNode n = (TreeNode) currentHead.getData();
                if (n.left != null) {
                    current.addToEnd(n.left);
                }
                if (n.right != null) {
                    current.addToEnd(n.right);
                }
                currentHead = currentHead.getNext();
            }
        }
        return results;
    }
}
