//Write a program to calculate and print the area of circle where the value of pi=3.14 and radius (input)..

import java.util.Scanner;

public class CircleAreaCalculator {
    public static void main(String[] args) {
        // Define the value of pi
        double pi = 3.14;

        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the radius
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        // Calculate the area of the circle
        double area = pi * radius * radius;

        // Print the area
        System.out.println("The area of the circle is: " + area);

        // Close the scanner object
        scanner.close();
    }
}