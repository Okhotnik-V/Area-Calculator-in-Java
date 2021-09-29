package com.company.model;


import com.company.ui.Calculated;
import com.company.ui.Numerical;

import java.util.Scanner;

public class Square implements Calculated {
    Numerical number = new Number();
    @Override
    public double calculate (Scanner scanner){
        System.out.println("Please enter the length of a side: ");
        double length = number.explore(scanner);
        double reply = length * length;
        return reply;
    }
}
