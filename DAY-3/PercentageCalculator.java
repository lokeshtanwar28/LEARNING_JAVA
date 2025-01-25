//Write a program to calculate and print the percentage of total marks where student has scored 430 marks out of 500.

import javax.swing.*;

public class PercentageCalculator {
    public static void main(String[] args) {
        // Total marks and marks obtained
        double totalMarks = 500;
        double marksObtained = 430;

        // Calculate percentage
        double percentage = (marksObtained / totalMarks) * 100;

        // Print the result
        System.out.println("Marks obtained: " + marksObtained + " out of " + totalMarks);
        System.out.println("Percentage: " + percentage + "%");
    }
}