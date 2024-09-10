import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check if the number is an Armstrong number
        if (isArmstrong(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }

        // Close the scanner
        scanner.close();
    }

    // Method to check if a number is an Armstrong number
    public static boolean isArmstrong(int number) {
        int originalNumber = number;
        int sum = 0;
        int digits = String.valueOf(number).length(); // Number of digits in the number

        // Calculate the sum of digits each raised to the power of the number of digits
        while (number > 0) {
            int digit = number % 10; // Extract the last digit
            sum += Math.pow(digit, digits); // Raise the digit to the power of the number of digits and add to sum
            number /= 10; // Remove the last digit
        }

        // Check if the sum is equal to the original number
        return sum == originalNumber;
    }
}
