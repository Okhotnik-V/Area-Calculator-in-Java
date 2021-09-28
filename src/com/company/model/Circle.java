package com.company.model;


import com.company.ui.Selective;

import java.util.Scanner;

public class Circle implements Selective {

    public double calculate (Scanner scanner){
        System.out.println("Please enter the radius of the circle: ");
        double radius = scanner.nextDouble();
        double reply = Math.PI * (radius * radius);
        System.out.println(reply);
        return reply;
    }
}
