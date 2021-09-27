package com.company;

import java.util.Scanner;

public class Square implements Selective{
    Scanner scanner = new Scanner(System.in);

    public int calculate (){
        System.out.println("Please enter the length of a side: ");
        double length = scanner.nextDouble();
        System.out.println(length * length);
        return 0;
    }
}
