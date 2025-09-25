package com.pluralsight;

import java.util.Scanner;

public class MultiplierCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        double num1 = scanner.nextDouble();
        System.out.println("Enter the second number");
        double num2 = scanner.nextDouble();

        System.out.println("Choose your option: ");
        System.out.println("(A)dd");
        System.out.println("(S)ubstract");
        System.out.println("(D)ivide");
        System.out.println("(M)ultiply");
        System.out.println("I'm kidding, you don't have a choice. We're multiplying");

        double result = num1 * num2;

        System.out.printf("Your result is: " + result);

        scanner.close();
    }
}
