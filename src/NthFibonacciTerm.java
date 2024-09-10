import java.util.Scanner;

public class NthFibonacciTerm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the position of the term
        System.out.print("Enter the position (N) to find the Nth term of the Fibonacci series: ");
        int n = scanner.nextInt();

        // Validate the input
        if (n <= 0) {
            System.out.println("Position must be a positive integer.");
        } else {
            // Calculate and print the Nth Fibonacci term
            int nthTerm = fibonacci(n);
            System.out.println("The " + n + "th term of the Fibonacci series is: " + nthTerm);
        }

        // Close the scanner
        scanner.close();
    }

    // Method to calculate the Nth Fibonacci term
    public static int fibonacci(int n) {
        if (n == 1) {
            return 0; // The 1st term is 0
        } else if (n == 2) {
            return 1; // The 2nd term is 1
        }

        int a = 0, b = 1, nextTerm;

        for (int i = 3; i <= n; i++) {
            nextTerm = a + b;
            a = b;
            b = nextTerm;
        }

        return b; // Return the Nth term
    }
}
