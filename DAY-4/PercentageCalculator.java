//write a program to find the percentage of marks. Input marks and total marks.
import java.util.Scanner;

public class PercentageCalculator {
    public static void main(String[] args) {
        // Create a Scanner object to get user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to input obtained marks
        System.out.print("Enter the obtained marks: ");
        double obtainedMarks = scanner.nextDouble();
        
        // Prompt the user to input the total marks
        System.out.print("Enter the total marks: ");
        double totalMarks = scanner.nextDouble();
        
        // Calculate the percentage
        double percentage = (obtainedMarks / totalMarks) * 100;
        
        // Print the percentage
        System.out.println("The percentage of marks is: " + percentage + "%");
        
        // Close the scanner
        scanner.close();
    }
}