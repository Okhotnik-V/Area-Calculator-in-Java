package com.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CirclePerimetryTest {
    CirclePerimetry circlePerimetry = new CirclePerimetry();

    @Test
    void circleTest() {
        assertEquals(75.39822368615503, circlePerimetry.calculation(12));
    }
}