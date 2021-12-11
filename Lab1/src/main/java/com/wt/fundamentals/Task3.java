package com.handen.wt.fundamentals;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Task3 {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter a:");
            double a = Double.parseDouble(reader.readLine());
            System.out.println("Enter b:");
            double b = Double.parseDouble(reader.readLine());
            System.out.println("Enter h:");
            double h = Double.parseDouble(reader.readLine());
            printTable(a, b, h);
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }

    private static void printTable(double a, double b, double h) {
        for(double x = a; x <= b; x += h) {
            System.out.println("| " + x + " | " + computeFunction(x) + " |");
        }
    }

    private static double computeFunction(double x) {
        return Math.tan(x);
    }
}
