package com.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    void testAdd() {
        assertEquals(30, calculator.add(10, 20));
    }

    @Test
    void testSubtract() {
        assertNotEquals(20, calculator.subtract(20, 5));
    }

    @Test
    void testPositive() {
        assertTrue(calculator.isPositive(50));
    }

    @Test
    void testNegative() {
        assertFalse(calculator.isPositive(-25));
    }

    @Test
    void testNull() {
        assertNull(calculator.getNullValue());
    }

    @Test
    void testNotNull() {
        assertNotNull(calculator.getMessage());
    }
}