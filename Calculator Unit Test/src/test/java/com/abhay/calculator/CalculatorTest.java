package com.abhay.calculator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    @DisplayName("Test Addition with positive, negative, decimal and zero values")
    void testAdd() {
        assertAll("Addition Tests",
                () -> assertEquals(10, calculator.add(5, 5)),
                () -> assertEquals(-2, calculator.add(-1, -1)),
                () -> assertEquals(5.5, calculator.add(2.5, 3.0)),
                () -> assertEquals(5, calculator.add(5, 0)),
                () -> assertNotEquals(11, calculator.add(5, 5))
        );
    }

    @Test
    @DisplayName("Test Subtraction with various inputs")
    void testSubtract() {
        assertAll("Subtraction Tests",
                () -> assertEquals(0, calculator.subtract(5, 5)),
                () -> assertEquals(-10, calculator.subtract(-5, 5)),
                () -> assertEquals(2.5, calculator.subtract(5.5, 3.0)),
                () -> assertEquals(5, calculator.subtract(5, 0))
        );
    }

    @Test
    @DisplayName("Test Multiplication with positive, negative and zero")
    void testMultiply() {
        assertAll("Multiplication Tests",
                () -> assertEquals(25, calculator.multiply(5, 5)),
                () -> assertEquals(-10, calculator.multiply(-5, 2)),
                () -> assertEquals(0, calculator.multiply(5, 0))
        );
    }

    @Test
    @DisplayName("Test Division with valid inputs")
    void testDivide() {
        assertAll("Division Tests",
                () -> assertEquals(5, calculator.divide(10, 2)),
                () -> assertEquals(-2, calculator.divide(-4, 2)),
                () -> assertEquals(2.5, calculator.divide(5, 2))
        );
    }

    @Test
    @DisplayName("Test Division by Zero should throw IllegalArgumentException")
    void testDivideByZero() {
        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> calculator.divide(10, 0));

        assertEquals("Cannot divide by zero", exception.getMessage());
    }

    @Test
    @DisplayName("Test Modulus operation")
    void testModulus() {
        assertAll("Modulus Tests",
                () -> assertEquals(1, calculator.modulus(5, 2)),
                () -> assertEquals(0, calculator.modulus(4, 2)),
                () -> assertEquals(0, calculator.modulus(0, 5))
        );
    }

    @Test
    @DisplayName("Test Modulus by Zero should throw IllegalArgumentException")
    void testModulusByZero() {
        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> calculator.modulus(10, 0));

        assertEquals("Cannot divide by zero", exception.getMessage());
    }

    @Test
    @DisplayName("Test Power function with positive, zero and negative exponent")
    void testPower() {
        assertAll("Power Tests",
                () -> assertEquals(8, calculator.power(2, 3)),
                () -> assertEquals(1, calculator.power(5, 0)),
                () -> assertEquals(0.25, calculator.power(2, -2))
        );
    }

    @Test
    @DisplayName("Test Square function")
    void testSquare() {
        assertAll("Square Tests",
                () -> assertEquals(25, calculator.square(5)),
                () -> assertEquals(0, calculator.square(0)),
                () -> assertEquals(4, calculator.square(-2))
        );
    }

    @Test
    @DisplayName("Test isPositive method")
    void testIsPositive() {
        assertAll("Positive Tests",
                () -> assertTrue(calculator.isPositive(10)),
                () -> assertFalse(calculator.isPositive(-5)),
                () -> assertFalse(calculator.isPositive(0))
        );
    }

    @Test
    @DisplayName("Test isNegative method")
    void testIsNegative() {
        assertAll("Negative Tests",
                () -> assertTrue(calculator.isNegative(-10)),
                () -> assertFalse(calculator.isNegative(5)),
                () -> assertFalse(calculator.isNegative(0))
        );
    }
}
