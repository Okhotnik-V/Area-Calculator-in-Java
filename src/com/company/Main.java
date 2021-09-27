package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Area Calculator! " +
                "\nEnter 1 to find the area of a Rectangle, " +
                "\nEnter 2 to find the area of a Square, " +
                "\nEnter 3 to find the area of a Triangle," +
                "\nEnter 4 to find the area of a Circle.");

        switch (scanner.nextInt()) {
            case 1:
                Selective rectangle = new Rectangle();
                rectangle.calculate();
                break;
            case 2:
                Selective square = new Square();
                square.calculate();
                break;
            case 3:
                Selective triangle = new Triangle();
                triangle.calculate();
                break;
            case 4:
                Selective circle = new Circle();
                circle.calculate();
                break;
        }
    }
}
