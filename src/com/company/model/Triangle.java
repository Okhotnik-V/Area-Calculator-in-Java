package com.company.model;


import com.company.ui.Selective;

import java.util.Scanner;

public class Triangle implements Selective {

    public double calculate (Scanner scanner){
        System.out.println("Please enter the base of the triangle: ");
        double base = scanner.nextDouble();
        System.out.println("Please enter the height of the triangle: ");
        double height = scanner.nextDouble();
        double reply = 0.5 * base * height;
        System.out.println(reply);
        return reply;
    }
}
