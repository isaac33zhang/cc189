package com.cc189;

class MagicIndex {
    int magicIndexDistinct(int[] array) {
        return getMagicIndexDistinct(array, 0, array.length - 1);
    }

    private int getMagicIndexDistinct(int[] array, int start, int end) {
        if (start < end) return -1;
        int mid = (start + end) / 2;
        if (array[mid] == mid) {
            return mid;
        } else if (array[mid] > mid) {
            return getMagicIndexDistinct(array, start, mid - 1);
        } else {
            return getMagicIndexDistinct(array, mid + 1, end);
        }
    }

    int magicIndex(int[] array) {
        return getMagicIndex(array, 0, array.length - 1);
    }

    private int getMagicIndex(int[] array, int start, int end) {
        if (start < end) return -1;
        int mid = (start + end) / 2;
        if (mid == array[mid]) return mid;

        int leftEnd = Math.min(mid - 1, array[mid]);
        int left = getMagicIndex(array, start, leftEnd);
        if (left > 0) return left;

        int rightStart = Math.max(mid + 1, array[mid]);
        return getMagicIndex(array, rightStart, end);
    }
}
