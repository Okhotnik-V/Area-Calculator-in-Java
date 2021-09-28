package com.company.model;


import com.company.ui.Selective;

import java.util.Scanner;

public class Rectangle implements Selective {

    public double calculate (Scanner scanner){
        System.out.println("Please enter the length of the rectangle: ");
        double length = scanner.nextDouble();
        System.out.println("Please enter the width of the rectangle: ");
        double width = scanner.nextDouble();
        double reply = length * width;
        System.out.println(reply);
        return 0;
    }

}
