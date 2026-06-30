import java.util.Scanner;

public class sumofdigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        
        // Storing original number for the final print statement
        int originalNumber = number; 
        int sum = 0;
        
        // Handle negative numbers by converting to absolute value
        number = Math.abs(number);
        
        while (number > 0) {
            // 1. Get the last digit (e.g., 123 % 10 = 3)
            int lastDigit = number % 10;
            
            // 2. Add it to our running total
            sum += lastDigit;
            
            // 3. Remove the last digit from the number (e.g., 123 / 10 = 12)
            number = number / 10;
        }
        
        System.out.println("The sum of the digits of " + originalNumber + " is: " + sum);
        
        scanner.close();
    }
}