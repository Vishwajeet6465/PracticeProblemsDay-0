import java.util.Scanner;

public class SumOfFirstN {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to find Sum of first N numbers: ");
		int n = sc.nextInt();
		int sum = 0;
		
		for(int i = 0; i < n+1; i++) {
			sum = sum + i;
		}
		System.out.println("Sum of first N nums is: "+ sum);
		sc.close();
	}
}
