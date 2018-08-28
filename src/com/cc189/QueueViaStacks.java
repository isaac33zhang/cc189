package com.cc189;

import java.util.Stack;

class QueueViaStacks<T> {
    private Stack<T> stackNew, stackOld;

    public QueueViaStacks() {
        stackNew = new Stack<T>();
        stackOld = new Stack<T>();
    }

    int size() {
        return stackNew.size() + stackOld.size();
    }

    void add(T v) {
        stackNew.push(v);
    }

    T peek() {
        shiftStacks();
        return stackOld.peek();
    }

    T remove() {
        shiftStacks();
        return stackOld.pop();
    }

    private void shiftStacks() {
        if (stackOld.empty()) {
            while (!stackNew.empty()) {
                stackOld.push(stackNew.pop());
            }
        }
    }
}
