package com.company;

import com.company.model.*;
import com.company.model.Number;
import com.company.ui.Calculated;
import com.company.ui.Numerical;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        started(scanner);
    }



    public static void started (Scanner scanner){
        Calculated rectangle = new Rectangle();
        Calculated square = new Square();
        Calculated triangle = new Triangle();
        Calculated circle = new Circle();
        Calculated righttriangle = new Righttriangle();


        System.out.println("Welcome to the Area Calculator! " +
                "\nEnter 1 to find the area of a Rectangle, " +
                "\nEnter 2 to find the area of a Square, " +
                "\nEnter 3 to find the area of a Triangle," +
                "\nEnter 4 to find the area of a Circle." +
                "\nEnter 5 to find the area of a Right Triangle,");


        switch (miss(scanner)) {
            case 1:
                System.out.println(rectangle.calculate(scanner));
                break;
            case 2:
                System.out.println(square.calculate(scanner));
                break;
            case 3:
                System.out.println(triangle.calculate(scanner));
                break;
            case 4:
                System.out.println(circle.calculate(scanner));
                break;
            case 5:
                System.out.println(righttriangle.calculate(scanner));
                break;

        }

        repeat(scanner);
    }


    public static int miss (Scanner scanner){
        Numerical number = new Number();
        int swich = (int) Math.round(number.explore(scanner));
        if (swich >= 6| swich == 0){
            System.out.println("Invalid number, please enter a number from 1 to 5");
            swich = miss(scanner);
        }
        return swich;
    }

    public static void repeat (Scanner scanner){
        System.out.println("Do you want to continue using the program? 1-YES, Others-EXIT");
        if (scanner.nextInt()==1){
            started(scanner);
        }
    }

}

