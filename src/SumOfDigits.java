import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Calculate the sum of digits
        int sum = calculateSumOfDigits(number);

        // Output the result
        System.out.println("The sum of the digits of " + number + " is: " + sum);

        // Close the scanner
        scanner.close();
    }

    // Method to calculate the sum of digits
    public static int calculateSumOfDigits(int number) {
        int sum = 0;
        // Convert the number to its absolute value to handle negative numbers
//        number = Math.abs(number);

        while (number > 0) {
            // Extract the last digit
            int digit = number % 10;
            // Add the digit to the sum
            sum += digit;
            // Remove the last digit
            number /= 10;
        }

        return sum;
    }
}
