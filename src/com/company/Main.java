package com.company;

import com.company.model.Circle;
import com.company.model.Rectangle;
import com.company.model.Square;
import com.company.model.Triangle;
import com.company.ui.Selective;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Area Calculator! " +
                "\nEnter 1 to find the area of a Rectangle, " +
                "\nEnter 2 to find the area of a Square, " +
                "\nEnter 3 to find the area of a Triangle," +
                "\nEnter 4 to find the area of a Circle.");

        Selective rectangle = new Rectangle();
        Selective square = new Square();
        Selective triangle = new Triangle();
        Selective circle = new Circle();

        switch (scanner.nextInt()) {
            case 1:
                rectangle.calculate(scanner);
                break;
            case 2:
                square.calculate(scanner);
                break;
            case 3:
                triangle.calculate(scanner);
                break;
            case 4:
                circle.calculate(scanner);
                break;
        }
    }
}
