import java.util.Scanner;

public class Greatest {
	public static void main(String[] args) {
		Scanner cs = new Scanner(System.in);
		System.out.println("Enter the First Number: ");
		int a = cs.nextInt();
		System.out.println("Enter the Second Number: ");
		int b = cs.nextInt();
		
		if(a > b) {
			System.out.println("First number "+ a +" is Greater than other.");
		}else if(a < b) {
			System.out.println("Second number "+ b +" is Greater than other.");
		}
		else {
			System.out.println("Both numbers "+ a + " & " + b + " are equal.");
		}
		cs.close();
	}
}
