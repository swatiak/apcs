package com.apcs.unit8;

/* 
unit8 -2D Array

2-D Array stores a table of data (rows and columns)
creates an array of arrays
Starts from 0 to length-1

Lesson 1: 2-D Arrays
Lesson 2: 2-D Array Algorithms

*/

public class Unit8 {
    public static void main(String[] args) {
        int[][] testScores = new int[25][4];
        boolean[] better = new boolean[25];

        print(testScores);
        testArray();

        int[][] mat = { { 1, 0, 4, 2, 4 }, { 3, 8, 2, 4, 7 } };
        System.out.println(search(mat, 4));

    }

    public int[][] grid = new int[4][3];

    public void loopArray() {
        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[0].length; c++) {

            }

        }

    }

    public static void print(int[][] ts) {
        for (int r = 0; r < ts.length; r++) {
            for (int c = 0; c < ts[0].length; c++) {
                System.out.print(ts[r][c] + " ");
            }
            System.out.println();
        }
    }

    /*
     * public static boolean improving(int[] scores) { for (int i = 1; i <
     * scores.length; i++) { if (scores[i] < scores[i-1]) { return false; } return
     * true; } }
     */

    public static void testArray() {
        int[][] array = new int[5][5];
        int u = 1;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = u;
                u++;
            }
        }

        System.out.println(array[3][3]);
    }

    public static int search(int[][] data, int target) {
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                if (data[i][j] == target) {
                    return i;
                }
            }
        }
        return -1;
    }

}
