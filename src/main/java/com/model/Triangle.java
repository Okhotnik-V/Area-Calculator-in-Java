package com.model;

import com.ui.Calculated;
import com.ui.Numerical;

import java.util.Scanner;

public class Triangle extends TrianglePerimetry implements Calculated {
    Numerical number = new Number();

    @Override
    public double calculate(Scanner scanner) {
        System.out.println("Please enter the base of the triangle: ");
        double base = number.explore(scanner);
        System.out.println("Please enter the height of the triangle: ");
        double height = number.explore(scanner);
        double reply = 0.5 * base * height;
        calculation(base, height);
        return reply;
    }
}
