package com.company.model;


import com.company.ui.Selective;

import java.util.Scanner;

public class Square implements Selective {

    public double calculate (Scanner scanner){
        System.out.println("Please enter the length of a side: ");
        double length = scanner.nextDouble();
        double reply = length * length;
        System.out.println(reply);
        return reply;
    }
}
