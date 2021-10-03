package com.model;

import com.ui.Calculated;
import com.ui.Numerical;
import java.util.Scanner;

public class Circle implements Calculated {
    Numerical number = new Number();

    @Override
    public double calculate(Scanner scanner){
        System.out.println("Please enter the radius of the circle: ");
        double radius = number.explore(scanner);
        double reply = Math.PI * (radius * radius);
        return reply;
    }
}
