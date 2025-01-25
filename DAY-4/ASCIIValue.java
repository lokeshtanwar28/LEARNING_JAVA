//Print the ASCII value of the character inputted by user
import java.util.Scanner;

public class ASCIIValue {
    public static void main(String[] args) {
        // Create a Scanner object to get user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to input a character
        System.out.print("Enter a character: ");
        char character = scanner.next().charAt(0);
        
        // Get the ASCII value of the character
        int asciiValue = (int) character;
        
        // Print the ASCII value
        System.out.println("The ASCII value of '" + character + "' is: " + asciiValue);
        
        // Close the scanner
        scanner.close();
    }
}