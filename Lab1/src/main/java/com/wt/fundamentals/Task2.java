package com.handen.wt.fundamentals;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Task2 {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter x:");
            double x = Double.parseDouble(reader.readLine());
            System.out.println("Enter y:");
            double y = Double.parseDouble(reader.readLine());

            boolean result = checkPointInsideArea(x, y);
            System.out.println("Point inside area:" + result);
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }

    private static boolean checkPointInsideArea(double x, double y) {
        return y >= 0.0 && y <= 5.0 && Math.abs(x) <= 4.0 || y < 0.0 && y >= -3.0 && Math.abs(x) <= 6.0;
    }
}
