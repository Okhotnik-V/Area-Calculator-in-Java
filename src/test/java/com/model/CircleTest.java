package com.model;

import org.junit.jupiter.api.Test;


import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class CircleTest {
    Circle circle = new Circle();
    Scanner mockScanner = mock(Scanner.class);

    @Test
    void circleTest() {
        when(mockScanner.nextLine()).thenReturn("6");
        assertEquals(113.09733552923255,circle.calculate(mockScanner));
    }
}