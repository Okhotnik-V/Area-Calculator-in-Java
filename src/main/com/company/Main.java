package main.com.company;

import main.com.company.model.Restart;
import main.com.company.model.Start;
import main.com.company.ui.Starting;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Starting startingStart = new Start();
        Starting startingRestart = new Restart();
        Scanner scanner = new Scanner(System.in);

        startingStart.started(scanner);
        startingRestart.started(scanner);
    }

}

