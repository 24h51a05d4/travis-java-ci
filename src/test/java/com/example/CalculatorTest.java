
package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    void testAddition() {
        assertEquals(10, calculator.add(4, 6));
    }

    @Test
    void testSubtraction() {
        assertEquals(5, calculator.subtract(9, 4));
    }

    @Test
    void testMultiplication() {
        assertEquals(24, calculator.multiply(4, 6));
    }

    @Test
    void testDivision() {
        assertEquals(5, calculator.divide(20, 4));
    }

    @Test
    void testDivisionByZero() {
        assertThrows(
            IllegalArgumentException.class,
            () -> calculator.divide(10, 0)
        );
    }
}
