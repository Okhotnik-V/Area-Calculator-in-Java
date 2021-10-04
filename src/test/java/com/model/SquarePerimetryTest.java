package com.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquarePerimetryTest {
    SquarePerimetry squarePerimetry = new SquarePerimetry();

    @Test
    void circleTest() {
        assertEquals(20, squarePerimetry.calculation(5));
    }
}

