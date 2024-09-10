import java.util.Scanner;

public class PerfectNumberChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a number
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        // Validate input
        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            // Check if the number is a perfect number
            if (isPerfectNumber(number)) {
                System.out.println(number + " is a Perfect number.");
            } else {
                System.out.println(number + " is not a Perfect number.");
            }
        }

        // Close the scanner
        scanner.close();
    }

    // Method to check if a number is a Perfect number
    public static boolean isPerfectNumber(int number) {
        int sum = 0;

        // Find all proper divisors of the number
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }

        // A number is perfect if it is equal to the sum of its proper divisors
        return sum == number;
    }
}
