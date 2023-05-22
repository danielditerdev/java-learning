package org.danielditer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {

    @Test
    public void calculateFactorialIfNumberGreaterThanZero() {
        Factorial factorial = new Factorial();
        int expected = 3628800;
        assertEquals(expected, factorial.calculateFactorial(10));
    }

    @Test
    public void calculateFactorialRecursiveIfNumberGreaterThanZero() {
        Factorial factorial = new Factorial();
        int expected = 3628800;
        assertEquals(expected, factorial.calculateFactorialRecursive(10));
    }
}