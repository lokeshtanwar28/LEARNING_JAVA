//Write a program to find the square of the double number
import java.util.Scanner;

public class SquareOfDouble {
    public static void main(String[] args) {
        // Create a Scanner object to get user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to input a double number
        System.out.print("Enter a double number: ");
        double number = scanner.nextDouble();
        
        // Calculate the square of the number
        double square = number * number;
        
        // Print the result
        System.out.println("The square of " + number + " is: " + square);
        
        // Close the scanner
        scanner.close();
    }
}