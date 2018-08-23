package com.cc189;

class MyLinkedList {
    private MyNode head;

    public MyLinkedList(Object data) {
        head = new MyNode(data);
    }

    public MyNode getHead() {
        return head;
    }

    public void addToEnd(Object data) {
        MyNode finder = head;
        while (finder.getNext() != null) {
            finder = finder.getNext();
        }
        MyNode node = new MyNode(data);
        finder.setNext(node);
        node.setPrevious(finder);
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