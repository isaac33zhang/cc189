package com.cc189;

class Palindrome {
    boolean isPalindrome(MyLinkedList l) {
        MyLinkedList reversedList = reverseLinkedList(l);
        return isEqual(reversedList, l);
    }

    MyLinkedList reverseLinkedList(MyLinkedList l) {
        MyLinkedList newList = new MyLinkedList(l.getHead().getData());
        MyNode node = l.getHead().getNext();
        while (node != null) {
            newList.addToStart(node.getData());
            node = node.getNext();
        }
        return newList;
    }

    boolean isEqual(MyLinkedList l1, MyLinkedList l2) {
        MyNode node1 = l1.getHead();
        MyNode node2 = l2.getHead();
        while (node1 != null && node2 != null) {
            if (node1.getData() != node2.getData()) {
                return false;
            }
            node1 = node1.getNext();
            node2 = node2.getNext();
        }
        return true;
    }
}
