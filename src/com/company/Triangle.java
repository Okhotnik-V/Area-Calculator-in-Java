package com.company;

import java.util.Scanner;

public class Triangle implements Selective{
    Scanner scanner = new Scanner(System.in);

    public int calculate (){
        System.out.println("Please enter the base of the triangle: ");
        double base = scanner.nextDouble();
        System.out.println("Please enter the height of the triangle: ");
        double height = scanner.nextDouble();
        System.out.println(0.5 * base * height);
        return 0;
    }
}
