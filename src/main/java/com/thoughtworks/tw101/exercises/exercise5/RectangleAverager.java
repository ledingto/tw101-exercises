package com.thoughtworks.tw101.exercises.exercise5;

public class RectangleAverager {

    public float averageArea(Rectangle[] rectangles) {

        float sumArea=0;
        int numRectangles = rectangles.length;

        for (Rectangle rect : rectangles) {
            sumArea+=rect.area();
        }

        return sumArea/numRectangles;
    }
}
