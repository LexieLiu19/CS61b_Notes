package com.cs61b.Array;

public class TwoDimenArray {

    public static void main(String[] args) {
        int[][] pascalsTriangle;
        pascalsTriangle = new int[4][];
        int[] rowZero = pascalsTriangle[0]; // rowZero is null


        pascalsTriangle[0] = new int[]{1};
        pascalsTriangle[1] = new int[]{1, 1};
        pascalsTriangle[2] = new int[]{1, 2, 1};
        pascalsTriangle[3] = new int[]{1, 3, 3, 1};


        int[] rowTwo = pascalsTriangle[2]; // rowTwo = {1,2,3}
        rowTwo[1] = -5; //change rowTwo[1] to -5;


        //second way to create a default 2d array
        int[][] matrix;
        matrix = new int[4][]; //
        matrix = new int[4][4]; // create a 2d array with default value; default value of int type:0

        //third way:
        int[][] matrix2 = new int[][]{{1}, {1, 1}, {1, 2, 1}, {1, 3, 3, 1}};
    }
}
