import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number of terms
        System.out.print("Enter the number of terms in the Fibonacci series: ");
        int n = scanner.nextInt();

        // Generate and print the Fibonacci series
        if (n <= 0) {
            System.out.println("Number of terms must be positive.");
        } else {
            System.out.println("Fibonacci series up to " + n + " terms:");
            printFibonacciSeries(n);
        }

        // Close the scanner
        scanner.close();
    }

    // Method to print Fibonacci series up to n terms
    public static void printFibonacciSeries(int n) {
        int a = 0, b = 1;

        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            // Compute the next Fibonacci number
            int nextTerm = a + b;
            a = b;
            b = nextTerm;
        }
        System.out.println(); // Move to the next line after printing all terms
    }
}
