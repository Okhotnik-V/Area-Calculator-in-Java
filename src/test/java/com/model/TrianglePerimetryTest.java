package com.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrianglePerimetryTest {
    TrianglePerimetry trianglePerimetry = new TrianglePerimetry();

    @Test
    void circleTest() {
        assertEquals(46.0, trianglePerimetry.calculation(12, 22));
    }

}