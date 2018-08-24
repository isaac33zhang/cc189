package com.cc189;

class SumLists {
    MyNode sumLists(MyNode list1, MyNode list2, int carry) {
        if (list1 == null && list2 == null && carry == 0) {
            return null;
        }
        int result = carry;
        if (list1 != null) {
            result = result + (Integer) list1.getData();
        }
        if (list2 != null) {
            result = result + (Integer) list2.getData();
        }
        MyNode current = new MyNode(result % 10);
        if (list1 != null || list2 != null) {
            MyNode more = sumLists(list1 == null ? null : list1.getNext(),
                                   list2 == null ? null : list2.getNext(),
                                   result >= 10 ? 1 : 0);
            current.setNext(more);
            if (more != null) { more.setPrevious(current); }
        }
        return current;
    }

    MyNode addLists(MyLinkedList l1, MyLinkedList l2) {
        int len1 = l1.getLength();
        int len2 = l2.getLength();
        if (len1 < len2) {
            addZeros(l1, len2 - len1);
        } else {
            addZeros(l2, len1 - len2);
        }
        DigitSum result = addListsHelper(l1.getHead(), l2.getHead());
        if (result.carry > 0) {
            MyLinkedList results = new MyLinkedList(result.digitNode);
            results.addToStart(1);
            return results.getHead();
        }
        return result.digitNode;
    }

    DigitSum addListsHelper(MyNode one, MyNode two) {
        if (one == null && two == null) {
            DigitSum sum = new DigitSum();
            return sum;
        }
        DigitSum newSum = addListsHelper(one.getNext(), two.getNext());
        int result = (Integer) one.getData() + (Integer) two.getData() + newSum.carry;
        MyNode node = new MyNode(result % 10);
        if (newSum.digitNode == null) {
            MyLinkedList list = new MyLinkedList(node);
            newSum.digitNode = list.getHead();
        } else {
            MyLinkedList list = new MyLinkedList(newSum.digitNode);
            list.addToStart(node.getData());
            newSum.digitNode = list.getHead();
        }
        newSum.carry = result / 10;
        return newSum;
    }

    void addZeros(MyLinkedList list, int number) {
        for (int i = 0; i < number; i++) {
            list.addToStart(0);
        }
    }
}

class DigitSum {
    MyNode digitNode = null;
    int carry = 0;
}
