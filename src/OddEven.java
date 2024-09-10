import java.util.Scanner;

public class OddEven {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to check whether it is Odd or Even: ");
		int n = sc.nextInt();
		
		if(n % 2 == 0) {
			System.out.println("It is Even.");
		}
		else {
			System.out.println("It is Odd");
		}
		sc.close();
	}
}
