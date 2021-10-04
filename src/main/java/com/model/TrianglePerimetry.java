package com.model;

public class TrianglePerimetry {

    public double calculation(double length, double width) {
        double perimetry = length + length + width;
        System.out.println("Perimetry = " + perimetry);
        return perimetry;
    }
}
