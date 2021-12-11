package com.handen.wt.classes_and_objects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Ball> balls = Arrays.asList(new Ball(10, Color.BLUE), new Ball(5, Color.BLUE), new Ball(10, Color.RED), new Ball(5, Color.GREEN));
        Basket basket = new Basket();
        basket.setBalls(balls);
        System.out.println("Total weight:" + basket.getBallsWeight());
        System.out.println("Total blue balls:" + basket.getBlueBallsCount());
    }
}
