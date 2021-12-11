package com.handen.wt.fundamentals;

public class Task6 {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int[][] matrix = createMatrix(array);
        printMatrix(array, matrix);
    }

    private static void printMatrix(int[] array, int[][] matrix) {
        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static int[][] createMatrix(int[] array) {
        int[][] matrix = new int[array.length][array.length];
        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array.length; j++) {
                matrix[j][i] = array[(i + j) % array.length];
            }
        }
        return matrix;
    }
}