package com.model;

public class RectanglePerimetry {

    public double calculation(double length, double width) {
        double perimetry = length * 2 + width * 2;
        System.out.println("Perimetry = " + perimetry);
        return perimetry;
    }
}
