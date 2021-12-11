package com.handen.wt.classes_and_objects;

class Ball {
    private int mWeight;
    private Color mColor;

    public Ball(int weight, Color color) {
        mWeight = weight;
        mColor = color;
    }

    public int getWeight() {
        return mWeight;
    }

    public Color getColor() {
        return mColor;
    }
}
