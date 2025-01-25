//Write a program to assign a value of 100.235 to a double variable and then convert it to int.
public class ConvertDoubleToInt {
    public static void main(String[] args) {
        // Assign the value 100.235 to a double variable
        double doubleValue = 100.235;
        
        // Convert the double to an int (this will truncate the decimal part)
        int intValue = (int) doubleValue;
        
        // Print the original double value and the converted int value
        System.out.println("The original double value is: " + doubleValue);
        System.out.println("The converted int value is: " + intValue);
    }
}