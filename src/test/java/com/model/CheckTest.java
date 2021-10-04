package com.model;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class CheckTest {
    Check check = new Check();
    Scanner mockScanner = mock(Scanner.class);

    @Test
    public void checkTest() {
        when(mockScanner.nextLine()).thenReturn("3");
        assertEquals(3,check.verify(mockScanner));
    }
}