import java.util.Scanner;

public class PerfectSquareChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a number
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        // Validate input
        if (number < 0) {
            System.out.println("Please enter a non-negative integer.");
        } else {
            // Check if the number is a perfect square
            if (isPerfectSquare(number)) {
                System.out.println(number + " is a Perfect Square.");
            } else {
                System.out.println(number + " is not a Perfect Square.");
            }
        }

        // Close the scanner
        scanner.close();
    }

    // Method to check if a number is a Perfect Square
    public static boolean isPerfectSquare(int number) {
        if (number < 0) {
            return false;
        }
        
        int sqrt = (int) Math.sqrt(number);
        return (sqrt * sqrt == number);
    }
}
