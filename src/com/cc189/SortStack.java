package com.cc189;

import java.util.Stack;

class SortStack {
    void sortStack(Stack<Integer> original) {
        Stack<Integer> helper = new Stack<Integer>();
        while (!original.empty()) {
            int current = original.pop();
            while (!helper.empty() && helper.peek() > current) {
                original.push(helper.pop());
            }
            helper.push(current);
        }
        while (!helper.empty()) {
            original.push(helper.pop());
        }
    }
}
