package com.cc189;

class MyLinkedList {
    private MyNode head;

    public MyLinkedList() {
        head = null;
    }

    public MyLinkedList(Object data) {
        head = new MyNode(data);
    }

    public MyLinkedList(MyNode node) {
        head = node;
    }

    public MyNode getHead() {
        return head;
    }

    public int getLength() {
        int cnt = 0;
        MyNode tracker = head;
        while (tracker != null) {
            cnt = cnt + 1;
            tracker = tracker.getNext();
        }
        return cnt;
    }

    public void addToEnd(Object data) {
        if (head == null) {
            head = new MyNode(data);
        } else {
            MyNode finder = head;
            while (finder.getNext() != null) {
                finder = finder.getNext();
            }
            MyNode node = new MyNode(data);
            finder.setNext(node);
            node.setPrevious(finder);
        }
    }

    public void addToStart(Object data) {
        if (head == null) {
            head = new MyNode(data);
        } else {
            MyNode newHead = new MyNode(data);
            newHead.setNext(head);
            head.setPrevious(newHead);
            head = newHead;
        }
    }

    public void printAllNodes() {
        MyNode printer = head;
        while (printer != null) {
            System.out.print(printer.getData());
            System.out.println();
            printer = printer.getNext();
        }
    }
}


class MyNode {
    private Object data;
    private MyNode next = null;
    private MyNode previous = null;

    public MyNode(Object value) {
        data = value;
    }

    public Object getData() {
        return data;
    }
    public void setData(Object value) { data = value; }
    public MyNode getNext() { return next; }
    public void setNext(MyNode node) { next = node; }
    public MyNode getPrevious() {return previous; }
    public void setPrevious(MyNode node) { previous = node; }
}