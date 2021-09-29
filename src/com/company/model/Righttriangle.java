package com.company.model;

import com.company.ui.Calculated;
import com.company.ui.Numerical;

import java.util.Scanner;

public class Righttriangle implements Calculated {
    Numerical number = new Number();

    @Override
    public double calculate(Scanner scanner) {
        System.out.println("Please enter the a of the triangle: ");
        double base = number.explore(scanner);
        System.out.println("Please enter the b of the triangle: ");
        double height = number.explore(scanner);
        double reply = base * height;
        return reply;
    }
}
