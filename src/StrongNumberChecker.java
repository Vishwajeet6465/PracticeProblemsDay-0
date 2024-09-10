import java.util.Scanner;

public class StrongNumberChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check if the number is a Strong number
        if (isStrongNumber(number)) {
            System.out.println(number + " is a Strong number.");
        } else {
            System.out.println(number + " is not a Strong number.");
        }

        // Close the scanner
        scanner.close();
    }

    // Method to check if a number is a Strong number
    public static boolean isStrongNumber(int number) {
        int originalNumber = number;
        int sum = 0;

        while (number > 0) {
            int digit = number % 10; // Extract the last digit
            sum += factorial(digit); // Add the factorial of the digit to sum
            number /= 10; // Remove the last digit
        }

        // Check if the sum of factorials equals the original number
        return sum == originalNumber;
    }

    // Method to calculate factorial of a number
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
