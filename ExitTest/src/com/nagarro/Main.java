package com.nagarro;

import java.util.InputMismatchException;
import java.util.Scanner;

//MainClass.java
public class Main {
    public static void main(String[] args) {
        // Create an instance of Calculate
        Calculate calc = new Calculate();
        Scanner scanner = new Scanner(System.in);

        try {
            // Ask user for the first number
            System.out.print("Enter the first number: ");
            double num1 = scanner.nextDouble();

            // Ask user for the second number
            System.out.print("Enter the second number: ");
            double num2 = scanner.nextDouble();

            // Ask user for the operator
            System.out.print("Enter the operator (+, -, *, /): ");
            char operator = scanner.next().charAt(0);

            // Perform calculation and print the result
            double result = calc.performCalculation(num1, num2, operator);
            System.out.println("Result: " + result);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter numeric values for numbers and a valid operator.");
        } finally {
            // Close the scanner
            scanner.close();
        }
    }

}
