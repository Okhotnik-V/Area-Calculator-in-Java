package com.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectanglePerimetryTest {
    RectanglePerimetry rectanglePerimetry = new RectanglePerimetry();

    @Test
    void circleTest() {
        assertEquals(48.0, rectanglePerimetry.calculation(12, 12));
    }
}