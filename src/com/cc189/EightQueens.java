package com.cc189;

import java.util.ArrayList;

class EightQueens {
    ArrayList<Integer[]> results = new ArrayList<Integer[]>();

    void placeQueen(int row, Integer[] cols) {
        if(row == 8) {
            this.results.add(cols.clone());
        } else {
            for(int col = 0; col < 8; col++) {
                if(isValid(cols, row, col)) {
                    cols[row] = col;
                    placeQueen(row + 1, cols);
                }
            }
        }
    }

    boolean isValid(Integer[] cols, int row, int col) {
        for(int anotherRow = 0; anotherRow < row; row++) {
            int anotherCol = cols[anotherRow];
            if(anotherCol == col) return false;
            int distanceCol = Math.abs(anotherCol - col);
            int distanceRow = row - anotherRow;
            if(distanceCol == distanceRow) return false;
        }
        return true;
    }
}
