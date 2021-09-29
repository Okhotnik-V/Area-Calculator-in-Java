package com.company.model;


import com.company.ui.Calculated;
import com.company.ui.Numerical;

import java.util.Scanner;

public class Rectangle implements Calculated {
    Numerical number = new Number();
    @Override
    public double calculate (Scanner scanner){
        System.out.println("Please enter the length of the rectangle: ");
        double length = number.explore(scanner);
        System.out.println("Please enter the width of the rectangle: ");
        double width = number.explore(scanner);
        double reply = length * width;
        return reply;
    }

}
