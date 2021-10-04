package com;

import com.model.Start;
import com.ui.Starting;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Starting start = new Start();
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i == 1; ) {
            start.started(scanner);
            System.out.println("Do you want to continue using the program? 1-No, Others-continue");
            if (scanner.nextLine() == "1") {
                i++;
            }
        }
    }
}

