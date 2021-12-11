package com.handen.wt.classes_and_objects;

import java.util.Collections;
import java.util.List;

class Basket {
    private List<Ball> mBalls = Collections.emptyList();

    public List<Ball> getBalls() {
        return mBalls;
    }

    public void setBalls(List<Ball> balls) {
        mBalls = balls;
    }

    public int getBallsWeight() {
        int weight = 0;
        for(Ball b : mBalls) {
            weight += b.getWeight();
        }
        return weight;
    }

    public int getBlueBallsCount() {
        int count = 0;
        for(Ball b : mBalls) {
            if(b.getColor() == Color.BLUE) {
                count++;
            }
        }
        return count;
    }
}
