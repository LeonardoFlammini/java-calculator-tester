package org.excercise.calculator;

public class Calculator {
    public static float add(float num1, float num2) {
        return num1 + num2;
    }

    public static float subtract(float num1, float num2) {
        return num1 - num2;
    }

    public static float divide(float num1, float num2) {
        if (num2 == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return num1 / num2;
    }

    public static float multiply(float num1, float num2) {
        return num1 * num2;
    }

    private Calculator() {
        throw new UnsupportedOperationException("Utility class");
    }
}
