package org.example;

public class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        if (mat.length == 0 || mat[0].length == 0) {
            return new int[0];
        }
        int[] result = new int[mat.length * mat[0].length];
        int r = 0;
        int c = 0;
        for (int i = 0; i < result.length; i++) {
            result[i] = mat[r][c];
            if ((r + c) % 2 == 0) {
                if (c == mat[0].length - 1) {
                    r++;
                } else if (r == 0) {
                    c++;
                } else {
                    r--;
                    c++;
                }
            } else {
                if (r == mat.length - 1) {
                    c++;
                } else if (c == 0) {
                    r++;
                } else {
                    r++;
                    c--;
                }
            }
        }
        return result;
    }
}
