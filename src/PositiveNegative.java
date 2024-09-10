import java.util.*;
public class PositiveNegative {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to check whether it is positive or not: ");
		int n = sc.nextInt();
		
		if(n > 0) {
			System.out.println("It is Positive.");
		}
		else if(n < 0) {
			System.out.println("It is Negative.");
		}
		else {
			System.out.println("It is not Positive nor Negative.");
		}
		sc.close();
	}
}
