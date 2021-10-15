package com.model;

public class RighttrianglePerimetry {

    public double calculation(double length, double width) {
        double perimetry = length + length + width;
        System.out.println("Perimetry = " + perimetry);
        return perimetry;
    }
}
