//Write a program to add 32 to the ASCII value of a character and print the equivalent character. in java
import java.util.Scanner;

public class AddToASCII {
    public static void main(String[] args) {
        // Create a Scanner object to get user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to input a character
        System.out.print("Enter a character: ");
        char character = scanner.next().charAt(0);
        
        // Get the ASCII value of the character
        int asciiValue = (int) character;
        
        // Add 32 to the ASCII value
        int newAsciiValue = asciiValue + 32;
        
        // Convert the new ASCII value back to a character
        char newCharacter = (char) newAsciiValue;
        
        // Print the new character
        System.out.println("The character obtained by adding 32 to the ASCII value is: " + newCharacter);
        
        // Close the scanner
        scanner.close();
    }
}