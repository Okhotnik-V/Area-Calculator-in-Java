package com.model;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class TriangleTest {
    Triangle triangle = new Triangle();
    Scanner mockScanner = mock(Scanner.class);
    @Test
    public void triangleTest() {
        when(mockScanner.nextLine()).thenReturn("15");
        assertEquals(112.5,triangle.calculate(mockScanner));

    }

}