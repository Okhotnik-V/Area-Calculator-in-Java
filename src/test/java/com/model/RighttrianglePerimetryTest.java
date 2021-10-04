package com.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RighttrianglePerimetryTest {
    RighttrianglePerimetry righttrianglePerimetry = new RighttrianglePerimetry();

    @Test
    void circleTest() {
        assertEquals(49.0, righttrianglePerimetry.calculation(15, 19));
    }
}

