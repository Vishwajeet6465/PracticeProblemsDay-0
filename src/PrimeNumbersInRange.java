import java.util.Scanner;

public class PrimeNumbersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the range
        System.out.print("Enter the start of the range: ");
        int start = scanner.nextInt();

        System.out.print("Enter the end of the range: ");
        int end = scanner.nextInt();

        if (start > end) {
            System.out.println("Invalid range: Start of the range should be less than or equal to the end.");
        } else {
            System.out.println("Prime numbers between " + start + " and " + end + " are:");

            // Find and print all prime numbers within the range
            for (int num = start; num <= end; num++) {
                if (isPrime(num)) {
                    System.out.print(num + " ");
                }
            }
            System.out.println(); // Move to the next line after printing all primes
        }

        // Close the scanner
        scanner.close();
    }

    // Method to check if a number is prime
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false; // Numbers less than or equal to 1 are not prime
        }
        if (number == 2) {
            return true; // 2 is the only even prime number
        }
        if (number % 2 == 0) {
            return false; // Other even numbers are not prime
        }
        // Check for factors from 3 to the square root of the number
        for (int i = 3; i <= Math.sqrt(number); i += 2) {
            if (number % i == 0) {
                return false; // Number is divisible by i, hence not prime
            }
        }
        return true; // Number is prime
    }
}
