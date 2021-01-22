package com.ss.basics.circle;

/**
 * @author John Kim
 *
 */

public class Circle implements ShapeInterface {
    
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double surfaceArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}
