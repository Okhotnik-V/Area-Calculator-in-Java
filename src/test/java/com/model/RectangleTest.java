package com.model;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class RectangleTest {
    Rectangle rectangle = new Rectangle();
    Scanner mockScanner = mock(Scanner.class);
    @Test
    public void rectangleTest() {
        when(mockScanner.nextLine()).thenReturn("10");
        assertEquals(100,rectangle.calculate(mockScanner));

    }

}