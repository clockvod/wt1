package com.handen.wt.fundamentals;

import java.util.Arrays;

public class Task7 {
    public static void main(String[] args) {
        int[] array = new int[]{1, 3, 5, 2, 4, 6, 10, 9, 8, 7};
        int[] sorted = shellSort(array);
        System.out.println(Arrays.toString(sorted));
    }

    private static int[] shellSort(int[] array) {

        for(int i = 0; i < array.length - 1; i++) {
            if(array[i] > array[i + 1]) {
                int temp = array[i + 1];
                array[i + 1] = array[i];
                array[i] = temp;
                i -= 2;
            }
        }
        return array;
    }
}
