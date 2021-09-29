package com.company.model;

import com.company.ui.Numerical;

import java.util.Scanner;

public class Number implements Numerical {

    public double explore (Scanner scanner){
        double number;
        if (scanner.hasNextDouble()){
            number = scanner.nextDouble();
        }
        else {
            System.out.println("Incorrect information, please enter a number.");
            scanner.nextLine();
            number = explore(scanner);
        }
        return number;
    }
}
