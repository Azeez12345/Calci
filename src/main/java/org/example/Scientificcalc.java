package org.example;

import java.util.Scanner;

public class Scientificcalc {

    public double addition(double a, double b) {
        return a + b;
    }

    public double subtraction(double a, double b) {
        return a - b;
    }

    public double multiplication(double a, double b) {
        return a * b;
    }

    public double division(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return a / b;
    }

    public double squareRoot(double x) {
        return Math.sqrt(x);
    }

    public int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers");
        }
        if (n == 0) {
            return 1;
        }
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public double naturalLogarithm(double x) {
        if (x <= 0) {
            throw new IllegalArgumentException("Natural logarithm is not defined for non-positive numbers");
        }
        return Math.log(x);
    }

    public double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    // Main method for demonstration purposes
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scientificcalc calculator = new Scientificcalc();
        int choice;

        do {
            System.out.println("Scientific Calculator Menu:");
            System.out.println("1. Square root function (√x)");
            System.out.println("2. Factorial function (x!)");
            System.out.println("3. Natural logarithm (ln(x))");
            System.out.println("4. Power function (x^b)");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter a number: ");
                    double number1 = scanner.nextDouble();
                    System.out.println("Square root of " + number1 + " is: " + calculator.squareRoot(number1));
                    break;
                case 2:
                    System.out.print("Enter a number: ");
                    int number2 = scanner.nextInt();
                    System.out.println("Factorial of " + number2 + " is: " + calculator.factorial(number2));
                    break;
                case 3:
                    System.out.print("Enter a number: ");
                    double number3 = scanner.nextDouble();
                    System.out.println("Natural logarithm of " + number3 + " is: " + calculator.naturalLogarithm(number3));
                    break;
                case 4:
                    System.out.print("Enter base (x): ");
                    double base = scanner.nextDouble();
                    System.out.print("Enter exponent (b): ");
                    double exponent = scanner.nextDouble();
                    System.out.println(base + " raised to the power of " + exponent + " is: " + calculator.power(base, exponent));
                    break;
                case 5:
                    System.out.println("Exiting the calculator. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 5.");
            }
        } while (choice != 5);

        scanner.close();
    }
}
