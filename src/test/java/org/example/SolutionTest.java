package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void findDiagonalOrderTest() {
        Solution solution = new Solution();
        int[][] inputOne = new int[][] {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        assertArrayEquals(new int[]{1,2,4,7,5,3,6,8,9}, solution.findDiagonalOrder(inputOne));
        int[][] inputTwo = new int[][] {
                {1,2},
                {3,4}
        };
        assertArrayEquals(new int[]{1,2,3,4}, solution.findDiagonalOrder(inputTwo));
    }

}