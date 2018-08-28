package com.cc189;

class MultiStack {
    private class StackInfo {
        int start, size, capacity;
        StackInfo(int start, int capacity) {
            this.start = start;
            this.capacity = capacity;
        }
    }

    private StackInfo[] info;
    private int[] values;

    MultiStack(int numberOfStacks, int defaultSize) {
        info = new StackInfo[numberOfStacks];
        for (int i = 0; i < numberOfStacks; i++) {
            info[i] = new StackInfo(defaultSize * i, defaultSize);
        }
        values = new int[numberOfStacks * defaultSize];
    }
}
