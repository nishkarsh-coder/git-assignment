package com.nagarro;
//Calculate.java
public class Calculate {
 // Method to perform calculation based on operator
 public double performCalculation(double num1, double num2, char operator) {
     double result = 0;
     try {
         switch (operator) {
             case '+':
                 result = num1 + num2;
                 break;
             case '-':
                 result = num1 - num2;
                 break;
             case '*':
                 result = num1 * num2;
                 break;
             case '/':
                 // Check for division by zero
                 if (num2 == 0) {
                     throw new ArithmeticException("Division by zero is not allowed.");
                 }
                 result = num1 / num2;
                 break;
             default:
                 throw new IllegalArgumentException("Invalid operator. Please use +, -, *, or /.");
         }
     } catch (ArithmeticException e) {
         System.out.println(e.getMessage());
         return 0; // Return 0 in case of division by zero
     } catch (IllegalArgumentException e) {
         System.out.println(e.getMessage());
         return 0; // Return 0 for any invalid operator
     }
     return result;
 }
}