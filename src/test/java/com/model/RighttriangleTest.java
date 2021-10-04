package com.model;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class RighttriangleTest {
    Righttriangle righttriangle = new Righttriangle();
    Scanner mockScanner = mock(Scanner.class);

    @Test
    public void righttriangleTest () {
        when(mockScanner.nextLine()).thenReturn("20");
        assertEquals(400,righttriangle.calculate(mockScanner));
    }
}