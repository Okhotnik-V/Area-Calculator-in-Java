package com.model;

import com.ui.Checked;
import com.ui.Numerical;
import java.util.Scanner;

public class Check implements Checked {

    public int verify(Scanner scanner){
        Numerical number = new Number();
        int swich = (int) Math.round(number.explore(scanner));
        if (swich >= 6| swich == 0){
            System.out.println("Invalid number, please enter a number from 1 to 5");
            swich = verify(scanner);
        }
        return swich;
    }
}
