package com.model;

import com.ui.Calculated;
import com.ui.Numerical;
import java.util.Scanner;

public class Circle extends CirclePerimetry implements Calculated {
    Numerical number = new Number();
    double radius;

    @Override
    public double calculate(Scanner scanner){
        System.out.println("Please enter the radius of the circle: ");
        radius = number.explore(scanner);
        double reply = Math.PI * (radius * radius);
        calculation(radius);
        return reply;
    }
}
