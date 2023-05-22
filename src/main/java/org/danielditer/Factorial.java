package org.danielditer;

public class Factorial {
    public int calculateFactorial(int number) {
        if (number > 0) {
            int factorial = 1;
            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }
            return factorial;
        } else {
            return 1;
        }
    }

    public int calculateFactorialRecursive(int number) {
        return number == 0 ? 1 : number * calculateFactorialRecursive(number - 1);
    }
}
