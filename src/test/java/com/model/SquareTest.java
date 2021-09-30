package com.model;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class SquareTest {
    Square square = new Square();
    Scanner mockScanner = mock(Scanner.class);
    @Test
    public void squareTest(){
        when(mockScanner.nextLine()).thenReturn("50");
        assertEquals(2500,square.calculate(mockScanner));
    }

}