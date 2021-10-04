package com;

import com.model.Restart;
import com.model.Start;
import com.ui.Starting;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Starting startingStart = (Starting) new Start();
        Starting startingRestart = new Restart();
        Scanner scanner = new Scanner(System.in);
        startingStart.started(scanner);
        startingRestart.started(scanner);
    }
}

