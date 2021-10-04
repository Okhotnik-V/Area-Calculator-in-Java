package com.model;

public class CirclePerimetry {

    public double calculation(double radius) {
        double perimetry = Math.PI * 2 * radius;
        System.out.println("Perimetry = " + perimetry);
        return perimetry;
    }
}
