package com.cc189;

import java.util.Stack;

class Tower {
    private Stack<Integer> disks;
    private int index;
    public Tower(int i) {
        disks = new Stack<Integer>();
        index = i;
    }

    int getIndex() {
        return index;
    }

    private void add(int d) {
        if (!disks.empty() && disks.peek() <= d) {
            System.out.print("Error putting disk" + d);
        } else {
            disks.push(d);
        }
    }

    private void moveTop(Tower t) {
        int top = disks.pop();
        t.add(top);
    }

    private void moveDisks(int n, Tower destination, Tower second) {
        if (n > 0) {
            moveDisks(n - 1, second, destination);
            moveTop(destination);
            second.moveDisks(n - 1, destination, this);
        }
    }
}