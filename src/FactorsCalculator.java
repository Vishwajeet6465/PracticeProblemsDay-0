import java.util.Scanner;

public class FactorsCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a number
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        // Validate input
        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            // Find and print factors
            System.out.println("Factors of " + number + " are:");
            printFactors(number);
        }

        // Close the scanner
        scanner.close();
    }

    // Method to print factors of a number
    public static void printFactors(int number) {
        // Iterate from 1 to the number
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) { // Check if i is a factor
                System.out.print(i + " ");
            }
        }
        System.out.println(); // Move to the next line after printing all factors
    }
}
