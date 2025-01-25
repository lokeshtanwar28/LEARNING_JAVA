// Write a java program to calculate the addition, subtraction, multiplication, division and modulus and than print it on the screen. 

import java.util.Scanner;

public class second {
    public static void main(String[] args) {
        // Create a Scanner object for taking user input
        Scanner scanner = new Scanner(System.in);

        // Prompt user for two numbers
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        // Perform the calculations
        double addition = num1 + num2;
        double subtraction = num1 - num2;
        double multiplication = num1 * num2;
        double division = (num2 != 0) ? num1 / num2 : 0; // To avoid division by zero
        double modulus = (num2 != 0) ? num1 % num2 : 0;  // To avoid modulus by zero

        // Print the results
        System.out.println("Addition: " + addition);
        System.out.println("Subtraction: " + subtraction);
        System.out.println("Multiplication: " + multiplication);
        if (num2 != 0) {
            System.out.println("Division: " + division);
            System.out.println("Modulus: " + modulus);
        } else {
            System.out.println("Division and Modulus by zero is not possible.");
        }

        // Close the scanner object
        scanner.close();
    }
}