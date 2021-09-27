package com.company;

import java.util.Scanner;

public class Rectangle implements Selective{
    Scanner scanner = new Scanner(System.in);

    public int calculate (){
        System.out.println("Please enter the length of the rectangle: ");
        double length = scanner.nextDouble();
        System.out.println("Please enter the width of the rectangle: ");
        double width = scanner.nextDouble();
        System.out.println(length * width);
        return 0;
    }

}
