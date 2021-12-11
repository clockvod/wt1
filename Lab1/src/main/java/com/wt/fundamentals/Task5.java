package com.handen.wt.fundamentals;

import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 5, 4};
        int[] result = getIncreasingSequence(array);
        printArray(result);
    }

    private static int[] getIncreasingSequence(int[] array) {
        List<Integer> result = new ArrayList<>();
        for(int i = 0; i < array.length; i++) {
            if(i == array.length - 1) {
                result.add(array[i]);
                continue;
            }
            if(array[i] <= array[i + 1]) {
                result.add(array[i]);
            }
        }
        return result.stream().mapToInt(i -> i).toArray();
    }

    private static void printArray(int[] array) {
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
