package com.handen.wt.fundamentals;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};

        printPrimalElements(array);
    }

    private static void printPrimalElements(int[] array) {
        System.out.println("\nPrime indexes:");
        for(int i = 0; i < array.length; i++) {
            if(isPrime(array[i])) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    private static boolean isPrime(int x) {
        if(x == 1) return false;
        for(int i = 2; i <= Math.sqrt(x); i++) {
            if(x % i == 0) {
                return false;
            }
        }
        return true;
    }
}
