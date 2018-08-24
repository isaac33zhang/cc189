package com.cc189;

import com.cc189.MyLinkedList.*;

class Partition {
    MyNode partition(MyLinkedList ll, int partition) {
        MyNode smaller = ll.getHead();
        MyNode larger = ll.getHead();
        MyNode current = ll.getHead();
        while (current != null) {
            MyNode next = current.getNext();
            if ((Integer) current.getData() < partition) {
                current.setNext(smaller);
                smaller.setPrevious(current);
                smaller = current;
            }
            else {
                larger.setNext(current);
                current.setPrevious(larger);
                larger = current;
            }
            current = next;
        }
        smaller.setPrevious(null);
        larger.setNext(null);
        return smaller;
    }
}
