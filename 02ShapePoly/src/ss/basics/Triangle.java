package com.ss.basics.triangle;

/**
 * @author John Kim
 *
 */

public class Triangle implements ShapeInterface {
    
    double height;
    double width;

    public Triangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public double surfaceArea() {
        return 0.5 * height * width;
    }

}
