package com.cc189;

import java.awt.*;
import java.util.ArrayList;
import java.util.HashSet;

class RobotInACrid {
    ArrayList<Point> getPath(boolean[][] matrix) {
        if (matrix == null || matrix.length == 0) return null;
        ArrayList<Point> path = new ArrayList<Point>();
        HashSet<Point> blockedPoint = new HashSet<Point>();
        if (getPath(matrix, matrix.length - 1, matrix[0].length - 1, path, blockedPoint)) {
            return path;
        }
        return null;
    }

    boolean getPath(boolean[][] matrix, int r, int c, ArrayList<Point> path, HashSet<Point> blockedPoint) {
        if (r < 0 || c < 0 || !matrix[r][c]) return false;
        Point p = new Point(r, c);
        if (blockedPoint.contains(p)) return false;
        System.out.print(r);
        System.out.print(c);
        System.out.println();
        boolean isOrigin = (r == 0) && (c == 0);
        if (isOrigin || getPath(matrix, r, c - 1, path, blockedPoint) || getPath(matrix, r - 1, c, path, blockedPoint)) {
            path.add(p);
            return true;
        }
        blockedPoint.add(p);
        return false;
    }
}
