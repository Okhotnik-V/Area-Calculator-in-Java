package com.company;

import java.util.Scanner;

public class Circle implements Selective{
    Scanner scanner = new Scanner(System.in);

    public int calculate (){
        System.out.println("Please enter the radius of the circle: ");
        double radius = scanner.nextDouble();
        System.out.println(Math.PI * (radius * radius));
        return 0;
    }
}
