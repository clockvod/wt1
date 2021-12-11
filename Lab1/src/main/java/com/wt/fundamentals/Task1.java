package com.handen.wt.fundamentals;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Task1 {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter x:");
            double x = Double.parseDouble(reader.readLine());
            System.out.println("Enter y:");
            double y = Double.parseDouble(reader.readLine());

            double result = computeExpression(x, y);
            System.out.println("Result: " + result);
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }

    private static double computeExpression(double x, double y) {
        double nominator = 1 + Math.sqrt(Math.sin(x + y));
        double denominator = 2 + Math.abs(x - 2 * x / (1 + Math.sqrt(x) * Math.sqrt(y)));
        return nominator / denominator + x;
    }
}
