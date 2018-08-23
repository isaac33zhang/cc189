package com.cc189;

import com.cc189.MyLinkedList.*;

class DeleteMiddleNode {
    void deleteMiddleNode(MyNode middleNode) {
        MyNode next = middleNode.getNext();
        middleNode.setData(next.getData());
        middleNode.setNext(next.getNext());
    }
}
