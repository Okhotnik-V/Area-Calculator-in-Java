package com.model;

import com.ui.Numerical;
import java.util.Scanner;

public class Number implements Numerical {

    @Override
    public double explore(Scanner scanner) {
        scanner.reset();
        double num;
        try {
            num = Double.parseDouble(scanner.nextLine());
            return num;
        } catch (NumberFormatException e) {
            System.out.println("Error. Enter number!");
            return explore(scanner);
        }
    }
}
