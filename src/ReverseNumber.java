import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Calculate the reverse of the number
        int reversedNumber = reverseNumber(number);

        // Output the result
        System.out.println("The reverse of " + number + " is: " + reversedNumber);

        // Close the scanner
        scanner.close();
    }

    // Method to reverse the digits of a number
    public static int reverseNumber(int number) {
        int reversed = 0;
        int originalNumber = number;
        
        // Convert the number to its absolute value to handle negative numbers

        while (number != 0) {
            int digit = number % 10; // Extract the last digit
            reversed = reversed * 10 + digit; // Append it to the reversed number
            number /= 10; // Remove the last digit from the original number
        }

        // If the original number was negative, make the reversed number negative
        if (originalNumber < 0) {
            reversed = -reversed;
        }

        return reversed;
    }
}
