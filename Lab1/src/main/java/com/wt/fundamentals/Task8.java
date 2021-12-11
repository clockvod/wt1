package com.handen.wt.fundamentals;

import java.util.ArrayList;
import java.util.List;

public class Task8 {
    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 3};
        int[] b = new int[]{4, 5, 6};

        int[] indexes = mergeSequences(a, b);
        printArray(indexes);
    }

    private static int[] mergeSequences(int[] a, int[] b) {
        List<Integer> result = new ArrayList<>();
        for(int i : a) {
            result.add(i);
        }
        int[] indexes = new int[a.length];

        for(int i = 0; i < b.length; i++) {
            int index = 0;
            int current = b[i];
            for(int j = 0; j < result.size(); j++) {
                if(result.get(j) < current) {
                    index = j;
                }
            }

            indexes[i] = index + 1;
            result.add(i + 1, current);
        }

        return indexes;
    }

    private static void printArray(int[] array) {
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
