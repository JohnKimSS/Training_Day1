package com.ss.basics.square;

/**
 * @author John Kim
 *
 */

public class Square implements ShapeInterface {

    double length;
    double width;

    public Square(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double surfaceArea() {
        return length * width;
    }

}