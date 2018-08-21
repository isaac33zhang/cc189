package com.cc189;

class ZeroMatrix {
    void generateZeroMatrix(int[][] matrix) {
        boolean firstRowZero = false;
        boolean firstColZero = false;
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[0][i] == 0) {
                firstRowZero = true;
                break;
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][0] == 0) {
                firstColZero = true;
                break;
            }
        }
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix.length; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        for (int i = 1; i < matrix.length; i++) {
            if (matrix[i][0] == 0) zerofyRow(matrix, i);
            if (matrix[0][i] == 0) zerofyCol(matrix, i);
        }

        if (firstRowZero) zerofyRow(matrix, 0);
        if (firstColZero) zerofyCol(matrix, 0);
    }

    void zerofyRow(int[][] matrix, int row) {
        for (int i = 0; i < matrix.length; i++) {
            matrix[row][i] = 0;
        }
    }

    void zerofyCol(int[][] matrix, int col) {
        for (int i = 0; i < matrix.length; i++) {
            matrix[i][col] = 0;
        }
    }
}
