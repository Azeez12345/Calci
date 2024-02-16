package org.example;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ScientificcalcTest {

    private Scientificcalc calculator;

    @Before
    public void setUp() {
        calculator = new Scientificcalc();
    }

    @After
    public void tearDown() {
        calculator = null;
    }

    @Test
    public void testAddition() {
        assertEquals(5.0, calculator.addition(2.0, 3.0), 0.001);
    }

    @Test
    public void testSubtraction() {
        assertEquals(2.0, calculator.subtraction(5.0, 3.0), 0.001);
    }

    @Test
    public void testMultiplication() {
        assertEquals(15.0, calculator.multiplication(3.0, 5.0), 0.001);
    }

    @Test
    public void testDivision() {
        assertEquals(2.5, calculator.division(5.0, 2.0), 0.001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDivisionByZero() {
        calculator.division(5.0, 0.0);
    }

    @Test
    public void testSquareRoot() {
        assertEquals(2.0, calculator.squareRoot(4.0), 0.001);
    }

    @Test
    public void testFactorial() {
        assertEquals(120, calculator.factorial(5));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNegativeFactorial() {
        calculator.factorial(-5);
    }

    @Test
    public void testNaturalLogarithm() {
        assertEquals(0.0, calculator.naturalLogarithm(1.0), 0.001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNonPositiveLogarithm() {
        calculator.naturalLogarithm(-1.0);
    }

    @Test
    public void testPower() {
        assertEquals(8.0, calculator.power(2.0, 3.0), 0.001);
    }
}