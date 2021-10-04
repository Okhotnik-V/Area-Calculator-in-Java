package com.model;

import com.ui.Numerical;
import java.util.Scanner;

public class Number implements Numerical {

    @Override
    public double explore (Scanner scanner){
        String number;
        number = scanner.nextLine();
        double num;
        try {
            Double.parseDouble(number);
            num = Double.parseDouble(number);
            return num;
        } catch (NumberFormatException e) {
            System.out.println("Error. Enter 2 times any number!");
            explore(scanner);
            number = scanner.nextLine();
            num = Double.parseDouble(number);
        }
        return num;
    }
}
