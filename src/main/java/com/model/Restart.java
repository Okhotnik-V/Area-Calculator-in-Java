package com.model;

import com.ui.Starting;
import java.util.Scanner;

public class Restart implements Starting {
    Starting starting = new Start();

    public void started(Scanner scanner) {
        System.out.println("Do you want to continue using the program? 1-YES, Others-EXIT");
        if (scanner.nextInt()==1){
            starting.started(scanner);
        }
    }
}
