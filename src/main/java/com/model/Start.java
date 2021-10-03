package com.model;



import com.ui.Calculated;
import com.ui.Checked;
import com.ui.Starting;

import java.util.Scanner;

public class Start implements Starting {
    Calculated rectangle = new Rectangle();
    Calculated square = new Square();
    Calculated triangle = new Triangle();
    Calculated circle = new Circle();
    Calculated righttriangle = new Righttriangle();
    Checked checked = new Check();

    public void started(Scanner scanner) {
        System.out.println("Welcome to the Area Calculator! " +
                "\nEnter 1 to find the area of a Rectangle, " +
                "\nEnter 2 to find the area of a Square, " +
                "\nEnter 3 to find the area of a Triangle," +
                "\nEnter 4 to find the area of a Circle." +
                "\nEnter 5 to find the area of a Right Triangle,");
        switch (checked.verify(scanner)) {
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

    }
}
