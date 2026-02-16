package com.abhay.calculator;
public class Calculator {

    // Addition
    public double add(double a, double b) {
        return a + b;
    }

    // Subtraction
    public double subtract(double a, double b) {
        return a - b;
    }

    // Multiplication
    public double multiply(double a, double b) {
        return a * b;
    }

    // Division
    public double divide(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return a / b;
    }

    // Modulus
    public double modulus(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return a % b;
    }

    // Power
    public double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    // Square
    public double square(double number) {
        return number * number;
    }

    // Check Positive
    public boolean isPositive(double number) {
        return number > 0;
    }

    // Check Negative
    public boolean isNegative(double number) {
        return number < 0;
    }
}
