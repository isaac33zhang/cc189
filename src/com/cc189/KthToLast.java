package com.cc189;

import com.cc189.MyLinkedList.*;

class KthToLast {
    int printKthToLast(MyNode head, int k) {
        if (head == null) {
            return 0;
        }
        int i = printKthToLast(head.getNext(), k) + 1;
        if (i == k) {
            System.out.print(head.getData());
            System.out.println();
        }
        return i;
    }

    MyNode kthToLast(MyNode head, int k) {
        Index index = new Index();
        return kthToLast(head, k, index);
    }

    MyNode kthToLast(MyNode head, int k, Index index) {
        if (head == null) { return null; }
        MyNode node = kthToLast(head.getNext(), k, index);
        index.value = index.value + 1;
        if (index.value == k) {
            return head;
        }
        return node;
    }

    MyNode kthToLastTwo(MyNode head, int k) {
        MyNode first = head;
        MyNode second = head;
        for (int i = 0; i < k; i++) {
            if (first == null) { return null; }
            first = first.getNext();
        }
        while (first.getNext() != null) {
            first = first.getNext();
            second = second.getNext();
        }
        return second;
    }
}


class Index {
    int value = 0;
}