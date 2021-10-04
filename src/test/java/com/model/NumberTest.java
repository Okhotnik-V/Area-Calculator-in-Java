package com.model;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class NumberTest {
    Number number = new Number();
    Scanner mockScanner = mock(Scanner.class);

    @Test
    public void numberTest() {
        when(mockScanner.nextLine()).thenReturn("2");
        assertEquals(2,number.explore(mockScanner));
    }
}