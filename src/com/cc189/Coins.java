package com.cc189;

class Coins {
    int ways(int n) {
        int[] types = {25, 10, 5, 1};
        int[][] map = new int[n + 1][types.length + 1];
        return ways(n, types, 0, map);
    }

    private int ways(int remaining, int[] types, int type, int[][] map) {
        if(map[remaining][type] > 0) return map[remaining][type];
        if(type >= types.length - 1) return 1;
        if(remaining == 0) return 1;
        int currentType = types[type];
        int newWays = 0;
        for(int i = 0; i * currentType <= remaining; i++) {
            int newRemaining = remaining - i * currentType;
            newWays += ways(newRemaining, types, type + 1, map);
        }
        map[remaining][type] = newWays;
        return newWays;
    }
}
