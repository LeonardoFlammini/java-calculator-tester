package org.excercise.calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CalculatorTest {

    @Test
    public void testAdd() {
        assertEquals(5.0f, Calculator.add(2.0f, 3.0f), 0.001f);
        assertEquals(0.0f, Calculator.add(-1.0f, 1.0f), 0.001f);
        assertEquals(-5.0f, Calculator.add(-2.0f, -3.0f), 0.001f);
    }

    @Test
    public void testSubtract() {
        assertEquals(-1.0f, Calculator.subtract(2.0f, 3.0f), 0.001f);
        assertEquals(-2.0f, Calculator.subtract(-1.0f, 1.0f), 0.001f);
        assertEquals(1.0f, Calculator.subtract(-2.0f, -3.0f), 0.001f);
    }

    @Test
    public void testMultiply() {
        assertEquals(6.0f, Calculator.multiply(2.0f, 3.0f), 0.001f);
        assertEquals(-1.0f, Calculator.multiply(-1.0f, 1.0f), 0.001f);
        assertEquals(6.0f, Calculator.multiply(-2.0f, -3.0f), 0.001f);
    }

    @Test
    public void testDivide() {
        assertEquals(2.0f, Calculator.divide(6.0f, 3.0f), 0.001f);
        assertEquals(-1.0f, Calculator.divide(-3.0f, 3.0f), 0.001f);
        assertEquals(1.5f, Calculator.divide(-3.0f, -2.0f), 0.001f);
    }

    @Test
    public void testDivideByZero() {
        assertThrows(ArithmeticException.class, () -> Calculator.divide(1.0f, 0.0f));
    }
}