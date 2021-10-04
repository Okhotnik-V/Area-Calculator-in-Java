package com.model;

import com.ui.Calculated;
import com.ui.Numerical;

import java.util.Scanner;

public class Square extends SquarePerimetry implements Calculated {
    Numerical number = new Number();

    @Override
    public double calculate(Scanner scanner) {
        System.out.println("Please enter the length of a side: ");
        double length = number.explore(scanner);
        double reply = length * length;
        calculation(length);
        return reply;
    }
}
